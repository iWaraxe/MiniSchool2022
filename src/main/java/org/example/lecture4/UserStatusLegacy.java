package org.example.lecture4;

import static com.google.common.base.Preconditions.checkArgument;

public class UserStatusLegacy {
    public static final UserStatusLegacy INITIAL = new UserStatusLegacy();
    public static final UserStatusLegacy ACTIVE = new UserStatusLegacy();
    public static final UserStatusLegacy DELETED = new UserStatusLegacy();

    private UserStatusLegacy() {
    }

}
