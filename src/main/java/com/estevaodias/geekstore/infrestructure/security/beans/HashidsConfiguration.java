package com.estevaodias.store.application.security;

import org.hashids.Hashids;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HashidsConfiguration {

  @Bean
  public Hashids hashids() {
    return new Hashids("\"^U(i[Qt0(D5~r8");
  }
}
