package com.estevaodias.geekstore.core.security;

public class UsernameNotFoundException extends RuntimeException {
  public UsernameNotFoundException(final Username username) {
    super("Username not found " + username.toLowerCase());
  }
}
