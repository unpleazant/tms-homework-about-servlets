package by.tms.servlet.registration;

import java.util.ArrayList;
import java.util.List;

public class UserStorage {

    private static final List<User> userList = new ArrayList<>();

    public static User createUser(String name, String login, String password) {
        return new User(name, login, password);
    }

    public static boolean isUserPresent(User user) {
        return userList.contains(user);
    }

    public static void addUser(User user) {
        userList.add(user);
    }

}