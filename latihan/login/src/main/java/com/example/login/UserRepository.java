package com.example.login;

import java.util.ArrayList;

public class UserRepository {
  private static ArrayList<User> users = new ArrayList<>();

  public static void addUser(User user) {
    users.add(user);
  }

  public static boolean isValidUser(String username, String password) {
    for (User user: users) {
      if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
        return true;
      }
    }
    return false;
  }
}
