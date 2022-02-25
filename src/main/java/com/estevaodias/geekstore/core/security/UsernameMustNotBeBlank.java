package com.estevaodias.geekstore.core.security;

public class UsernameMustNotBeBlank {

  public boolean isSatisfiedBy(final Username username) {
    return !username.natural().isBlank();
  }
}
