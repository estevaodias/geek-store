package com.estevaodias.geekstore.infrastructure.security.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import static java.util.Collections.emptyList;

@Configuration
class UserDetailsServiceConfiguration {

  @Bean
  public UserDetailsService userDetailsService() {
    return username -> new User("", "", emptyList());
  }
}
