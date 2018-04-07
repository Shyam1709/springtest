package com.wedding.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.wedding.model.MehndiCeremony;

public interface MehndiRepository extends MongoRepository<MehndiCeremony, String> {

}
