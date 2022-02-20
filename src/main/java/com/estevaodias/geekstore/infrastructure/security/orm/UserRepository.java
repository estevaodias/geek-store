package com.estevaodias.geekstore.infrastructure.security.orm;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;
import java.util.UUID;

interface UserRepository extends PagingAndSortingRepository<UserEntity, UUID> {

  Optional<UserEntity> findByUsername(String username);
}
