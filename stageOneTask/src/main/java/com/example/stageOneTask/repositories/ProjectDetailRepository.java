package com.example.stageOneTask.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectDetailRepository extends MongoRepository<ProjectDetailRepository, String> {

}
