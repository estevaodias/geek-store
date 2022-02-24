package com.estevaodias.geekstore.infrastructure.security.orm;

import org.springframework.stereotype.Component;

@Component
class UserServiceImpl {

  private final UserRepository userRepository;

  protected UserServiceImpl(final UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void save(final UserEntity userEntity) {
    userRepository.save(userEntity);
  }
}
