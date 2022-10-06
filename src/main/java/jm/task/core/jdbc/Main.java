package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.saveUser("Ivan", "Gorec", (byte) 22);
        System.out.println(userService.getAllUsers().get(0));
    }
}
