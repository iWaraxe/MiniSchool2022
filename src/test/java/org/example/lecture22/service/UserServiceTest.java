package org.example.lecture22.service;

import org.example.lecture22.domain.User;
import org.example.lecture22.domain.UserStatus;
import org.example.lecture22.persistence.UserStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.example.lecture22.data.UserTestSamples.anyUser;
import static org.example.lecture22.data.UserTestSamples.validUser;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class UserServiceTest {

    @Mock
    private UserValidator userValidator;
    @Mock
    private UserStorage userStorage;

    private UserService userService;

    @BeforeEach
    public void before() {
        MockitoAnnotations.openMocks(this);
        userService = new UserService(userStorage, userValidator);
    }


    @Test
    void createUser_invalid() {
        //given
        User user = anyUser();
        when(userValidator.validateForCreation(user)).thenReturn(false);

        // expect
        assertThrows(IllegalArgumentException.class, () -> userService.createUser(user));
        verify(userStorage, never()).persist(user);
    }

    @Test
    void createUser_userNameIsBusy() {
        // given
        String userName = "busy_name";
        when(userStorage.findByUsername(userName)).thenReturn(Optional.of(anyUser()));

        User user = validUser(userName);
        when(userValidator.validateForCreation(user)).thenReturn(true);

        // expect
        assertThrows(IllegalStateException.class, () -> userService.createUser(user));
    }

    @Test
    void createUser() {
        // given
        String userName = "name";
        // no users with a name in storage
        when(userStorage.findByUsername(userName)).thenReturn(Optional.empty());

        User user = validUser(userName);
        when(userValidator.validateForCreation(user)).thenReturn(true);

        // when
        String id = userService.createUser(user);

        // then
        //assertNotNull(id);
        verify(userStorage).persist(user);
        assertThat(user.getStatus(), is(UserStatus.INITIAL));
    }
}