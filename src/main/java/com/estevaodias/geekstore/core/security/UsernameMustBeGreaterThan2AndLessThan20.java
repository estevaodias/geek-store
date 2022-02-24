package com.estevaodias.geekstore.core.security;

import com.estevaodias.geekstore.core.security.Username;

public class UsernameMustBeGreaterThan2AndLessThan20 {

  public boolean isSatisfiedBy(final Username username) {
    return username.natural().length() > 2 && username.natural().length() < 20;
  }
}
