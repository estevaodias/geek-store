package com.estevaodias.geekstore.infrastructure.security.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
class PasswordEncoderConfiguration {

  @Bean
  public PasswordEncoder passwordEncoder() {
    final int strength = 11;
    return new BCryptPasswordEncoder(strength);
  }
}
