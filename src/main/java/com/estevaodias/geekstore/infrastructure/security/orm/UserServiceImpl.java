package com.estevaodias.geekstore.infrastructure.security.orm;

import com.estevaodias.geekstore.core.security.*;
import org.springframework.stereotype.Component;

@Component
class UserServiceImpl implements FindUserByUsername {

  private final Encoder encoder;
  private final UserRepository userRepository;

  protected UserServiceImpl(final Encoder encoder, final UserRepository userRepository) {
    this.encoder = encoder;
    this.userRepository = userRepository;
  }

  public void save(final UserEntity userEntity) {
    userRepository.save(userEntity);
  }

  @Override
  public User findBy(final Username username) {
    return userRepository.findByUsername(username.natural())
        .map(userEntity -> UserImpl.builder()
            .id(userEntity.getId().toString())
            .username(new Username(userEntity.getUsername()))
            .email(new Email(userEntity.getEmail()))
            .password(new Password(encoder, userEntity.getPassword()))
            .phone(new Phone(userEntity.getPhone()))
            .build())
        .orElseThrow(() -> new UsernameNotFoundException(username));
  }
}
