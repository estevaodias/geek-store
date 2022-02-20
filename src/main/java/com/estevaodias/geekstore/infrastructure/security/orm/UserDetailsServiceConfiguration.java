package com.estevaodias.geekstore.infrastructure.security.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import static java.util.Collections.emptyList;

@Configuration
class UserDetailsServiceConfiguration {

  @Bean
  public UserDetailsService userDetailsService() {
    return username -> {
      final var user = userRepository.findByUsername(username)
          .orElseThrow(() -> new UsernameNotFoundException(username));

      return new User(user.getUsername(), "", emptyList());
    };
  }
}
