package com.estevaodias.geekstore.core.security;

import java.util.Optional;

public interface UsernameNotBeenUsedConstraint {

  Optional<Username> findBy(Username username);
}
