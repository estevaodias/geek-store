package com.estevaodias.geekstore.core.security;

public class UsernameMustNotBeInUse {

  public final FindUserByUsername findUserByUsername;

  public UsernameMustNotBeInUse(final FindUserByUsername findUserByUsername) {
    this.findUserByUsername = findUserByUsername;
  }

  public boolean isSatisfiedBy(final Username username) {
    return findUserByUsername.findBy(username).isEmpty();
  }
}
