package com.estevaodias.geekstore.core.security;

import org.apache.commons.text.WordUtils;

public class Username {

  private final String value;

  public Username(final String value) {
    this.value = value;
  }

  public String natural() {
    return value;
  }

  public String capitalize() {
    return WordUtils.capitalizeFully(value);
  }

  public String toLowerCase() {
    return value.toLowerCase();
  }

  public String toUpperCase() {
    return value.toUpperCase();
  }
}
