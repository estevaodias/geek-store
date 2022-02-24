package com.estevaodias.geekstore.core.security;

import com.estevaodias.geekstore.core.security.Username;

public class UsernameMustNotBeBlank {

  public boolean isSatisfiedBy(final Username username) {
    return !username.natural().isBlank();
  }
}
