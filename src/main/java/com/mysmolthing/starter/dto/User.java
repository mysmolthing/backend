package com.mysmolthing.starter.dto;

import com.fasterxml.jackson.annotation.JsonGetter;


public class User {

  String email;
  String name;

  public User(String name, String email) {
    this.email = email;
    this.name = name;
  }

  @JsonGetter
  public String getEmail() {
    return email;
  }

  @JsonGetter
  public String getName() {
    return name;
  }
}
