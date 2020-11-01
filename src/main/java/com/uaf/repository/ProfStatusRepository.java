package com.uaf.repository;

import com.uaf.models.EProfStatus;
import com.uaf.models.EStatus;
import com.uaf.models.ProfStatus;
import com.uaf.models.Status;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProfStatusRepository extends MongoRepository<ProfStatus, String> {
  Optional<ProfStatus> findByName(EProfStatus name);
}
