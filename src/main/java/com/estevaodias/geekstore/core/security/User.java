package com.estevaodias.geekstore.core.security;

import java.util.Set;

public interface User {
  String getId();

  Set<Email> getEmail();

  Password getPassword();

  Set<Phone> getPhone();

  Username getUsername();
}
