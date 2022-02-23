package com.estevaodias.geekstore.infrastructure.security.orm;

import com.estevaodias.geekstore.core.security.*;
import lombok.Builder;

class UserImpl implements User {

  private final String id;
  private final Email email;
  private final Password password;
  private final Phone phone;
  private final Username username;

  @Builder
  public UserImpl(final String id, final Email email, final Password password,
      final Phone phone, final Username username) {
    this.id = id;
    this.email = email;
    this.password = password;
    this.phone = phone;
    this.username = username;
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public Email getEmail() {
    return email;
  }

  @Override
  public Password getPassword() {
    return password;
  }

  @Override
  public Phone getPhone() {
    return phone;
  }

  @Override
  public Username getUsername() {
    return username;
  }
}
