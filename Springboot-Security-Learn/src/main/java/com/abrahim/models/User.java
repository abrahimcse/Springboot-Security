package com.abrahim.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class User {

  String username;
  String password;
  String email;

  public User(String username, String password, String email) {
    this.username = username;
    this.password = password;
    this.email = email;
  }

}
