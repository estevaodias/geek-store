package com.estevaodias.geekstore.core.security;

public class Password {

  private final Encoder encoder;
  private final String value;

  public Password(final Encoder encoder, final String value) {
    this.encoder = encoder;
    this.value = value;
  }

  public String encode() {
    return encoder.encode(value);
  }
}
