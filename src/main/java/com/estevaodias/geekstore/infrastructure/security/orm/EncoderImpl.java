package com.estevaodias.geekstore.infrastructure.security.orm;

import com.estevaodias.geekstore.core.security.Encoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
class EncoderImpl implements Encoder {

  private final PasswordEncoder passwordEncoder;

  EncoderImpl(final PasswordEncoder passwordEncoder) {
    this.passwordEncoder = passwordEncoder;
  }

  @Override
  public String encode(final String value) {
    return passwordEncoder.encode(value);
  }
}
