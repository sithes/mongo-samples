package com.uaf.repository;

import java.util.Optional;

import com.uaf.models.ERole;
import com.uaf.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
