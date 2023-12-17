package com.abrahim.controllers;

import com.abrahim.models.User;
import com.abrahim.services.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

  private final UserService userService;

  //all users
  @GetMapping("/")
  public List<User> getAllUser(){
    return this.userService.getAllUser();
  }

  //Return Single User

  @GetMapping("/{username}")
  public User getUser( @PathVariable("username") String username){
    return this.userService.getUser(username);
  }

  @PostMapping("/")
  public User add(@RequestBody User user){
    return this.userService.addUser(user);
  }
}
