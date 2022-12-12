package org.example.lecture5;

import org.example.lecture5.user.User;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.UUID;

public class Runner {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User(new UUID(10, 1), "Tyrion", "Lannister");

        // public
        // private
        //
        // protected
        Class<User> userClass = User.class;

        System.out.println(userClass.getSimpleName());

        user.getStatus();

        // reflection
        final String methodName = "someMethod";
        System.out.println(Arrays.toString(userClass.getDeclaredMethods()));
        Method method = userClass.getDeclaredMethod(methodName, String.class, String.class);
        method.setAccessible(true);
        method.invoke(user,"Igor", "Waraxe");
    }
}
