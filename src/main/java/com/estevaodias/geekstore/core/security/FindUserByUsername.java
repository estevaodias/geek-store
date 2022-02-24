package com.estevaodias.geekstore.core.security;

import java.util.Optional;

public interface FindUserByUsername {

  Optional<User> findBy(Username username);
}
