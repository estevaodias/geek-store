package com.estevaodias.geekstore.core.security;

public interface User {
  String getId();

  Email getEmail();

  Password getPassword();

  Phone getPhone();

  Username getUsername();
}
