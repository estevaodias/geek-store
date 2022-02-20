package com.estevaodias.geekstore.infrastructure.security.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
class CorsConfigurationSourceConfiguration {

  /**
   * FIXME remove /** when any origin becomes known
   *
   * @return {@link CorsConfigurationSource}
   */
  @Bean
  public CorsConfigurationSource configurationSource() {
    final var urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
    urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
    return urlBasedCorsConfigurationSource;
  }
}
