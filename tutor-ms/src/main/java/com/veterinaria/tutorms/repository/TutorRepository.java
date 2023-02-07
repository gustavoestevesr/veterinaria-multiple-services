package com.veterinaria.tutorms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.veterinaria.tutorms.model.Tutor;

@Repository
public interface TutorRepository extends MongoRepository<Tutor, String>{
    
}
