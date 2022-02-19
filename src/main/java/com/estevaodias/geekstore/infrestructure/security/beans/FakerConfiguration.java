package com.estevaodias.geekstore.infrestructure.security.beans;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Locale;

@Configuration
class FakerConfiguration {

  @Bean
  public Faker faker() {
    return new Faker(new Locale("pt-BR"));
  }
}
