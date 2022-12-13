package org.example.lecture22.persistence;

import org.example.lecture22.domain.User;
import org.junit.jupiter.api.Test;

import static org.example.lecture22.data.UserTestSamples.anyValidUser;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UserStorageTest {
    // TDD = test driven development
    private UserStorage userStorage = new UserStorage();

    @Test
    void persist() {
        // given
        User user = anyValidUser();

        // when
        String id = userStorage.persist(user);

        // then
        //assertNotNull(id, message: "id is generated"); // JUnit5
        assertThat("id is generated on creation", id, is(not(null))); // Hamcrest
        User loaded = userStorage.load(id);
        //assertEquals(loaded, user);
        assertThat(loaded, is(equalTo(user)));
    }

    @Test
    public void testPersist_null() {
        // when
        assertThrows(NullPointerException.class, () -> userStorage.persist(null));
    }
}