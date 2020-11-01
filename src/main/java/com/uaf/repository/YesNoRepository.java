package com.uaf.repository;

import com.uaf.models.EYesNo;
import com.uaf.models.YesNo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface YesNoRepository extends MongoRepository<YesNo, String> {
  Optional<YesNo> findByName(EYesNo name);
}
