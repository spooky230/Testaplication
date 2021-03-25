package com.lesson.enums;

import com.lesson.enums.model.User;
import com.lesson.enums.model.UserRole;

import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;

public class EnumMain {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Bill");
        user.setUsername("billy561");
        user.setRegistrationDate("12/03/2015");
        user.setRoles(
                EnumSet.of(
                        UserRole.ADMIN,
                        UserRole.MODERATOR,
                        UserRole.USER));
        User user1 = new User();
        user1.setName("Jack");
        user1.setUsername("j654");
        user1.setRegistrationDate("13/06/2018");
        user1.setRoles(
                EnumSet.of(
                        UserRole.MODERATOR,
                        UserRole.USER));
        User user2 = new User();
        user2.setName("Mike");
        user2.setUsername("mike_strong15");
        user2.setRegistrationDate("22/11/2014");
        user2.setRoles(
                EnumSet.of(
                        UserRole.BANNED,
                        UserRole.USER));
        List<User> moderators = new LinkedList<>();
        if (user.getRoles().contains(UserRole.MODERATOR)) {
            moderators.add(user);
        }
        if (user1.getRoles().contains(UserRole.MODERATOR)) {
            moderators.add(user1);
        }
        if (user2.getRoles().contains(UserRole.MODERATOR)) {
            moderators.add(user2);
        }
        for (User usr : moderators) {
            System.out.println(usr.getUsername() + " is a moderator");
        }
    }
}
