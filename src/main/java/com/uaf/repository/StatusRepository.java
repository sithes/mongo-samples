package com.uaf.repository;

import com.uaf.models.EStatus;
import com.uaf.models.Status;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface StatusRepository extends MongoRepository<Status, String> {
  Optional<Status> findByName(EStatus name);
}
