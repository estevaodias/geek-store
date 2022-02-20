package com.estevaodias.geekstore.core.security;

public class UsernameSpecification {

  final private UsernameNotBeenUsedConstraint usernameNotBeenUsedConstraint;

  public UsernameSpecification(final UsernameNotBeenUsedConstraint usernameNotBeenUsedConstraint) {
    this.usernameNotBeenUsedConstraint = usernameNotBeenUsedConstraint;
  }

  public boolean isSatisfiedBy(final Username username) {
    return usernameNotBeenUsedConstraint.findBy(username).isEmpty() &&
        username.value().length() > 2 && username.value().length() < 20;
  }
}
