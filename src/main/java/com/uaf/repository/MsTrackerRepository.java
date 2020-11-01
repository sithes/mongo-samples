package com.uaf.repository;

import com.uaf.models.MsTracker;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface MsTrackerRepository extends MongoRepository<MsTracker, String> {
  Optional<MsTracker> findByMsName(String msName);

  Boolean existsByMsName(String msName);

  @Override
  List<MsTracker> findAll();
}
