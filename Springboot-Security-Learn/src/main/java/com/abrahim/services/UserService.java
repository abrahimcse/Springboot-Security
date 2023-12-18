package com.abrahim.services;

import com.abrahim.models.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  List<User> list = new ArrayList<>();

  public UserService() {
    list.add(new User("Akash", "akash123", "akash@gmail.com"));
    list.add(new User("Raju", "raju123", "raju@gmail.com"));
  }

  //get all user
  public List<User> getAllUser() {
    return this.list;
  }

  //get single user
  public User getUser(String username) {
    return this.list.stream().filter(e -> e.getUsername().equals(username)).findAny().orElse(null);
  }

  //add new user
  public User addUser(User user) {
    this.list.add(user);
    return user;
  }
}
