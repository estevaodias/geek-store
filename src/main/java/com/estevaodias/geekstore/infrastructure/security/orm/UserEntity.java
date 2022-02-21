package com.estevaodias.geekstore.infrastructure.security.orm;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Getter
@RequiredArgsConstructor
@Setter
@Table(name = "users", indexes = {
    @Index(columnList = "email", name = "UX_USERS_EMAIL", unique = true),
    @Index(columnList = "username", name = "UX_USERS_USERNAME", unique = true),
})
@ToString
class UserEntity {

  @Id
  @GeneratedValue
  @Column(length = 36, nullable = false, unique = true, updatable = false)
  private UUID id;

  @Column(length = 320, nullable = false, unique = true)
  private String email;

  @Column(length = 100, nullable = false, unique = true, updatable = false)
  private String username;

  @Column(length = 72, nullable = false)
  private String password;

  @Column(length = 14, nullable = false)
  private String phone;

  @Builder
  protected UserEntity(final String email, final String username, final String password,
      final String phone) {
    this.email = email;
    this.username = username;
    this.password = password;
    this.phone = phone;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    final UserEntity that = (UserEntity) o;
    return id != null && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return getClass().hashCode();
  }
}
