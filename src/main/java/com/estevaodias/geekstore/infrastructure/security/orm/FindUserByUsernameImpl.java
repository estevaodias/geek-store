package com.estevaodias.geekstore.infrastructure.security.orm;

import com.estevaodias.geekstore.core.security.*;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
class FindUserByUsernameImpl implements FindUserByUsername {

  private final Encoder encoder;
  private final UserRepository userRepository;

  protected FindUserByUsernameImpl(final Encoder encoder, final UserRepository userRepository) {
    this.encoder = encoder;
    this.userRepository = userRepository;
  }

  @Override
  public Optional<User> findBy(final Username username) {
    return userRepository.findByUsername(username.natural())
        .map(userEntity -> {
          final var user = (User) UserImpl.builder()
              .id(userEntity.getId().toString())
              .username(new Username(userEntity.getUsername()))
              .email(new Email(userEntity.getEmail()))
              .password(new Password(encoder, userEntity.getPassword()))
              .phone(new Phone(userEntity.getPhone()))
              .build();
          return Optional.of(user);
        })
        .orElse(Optional.empty());
  }
}
