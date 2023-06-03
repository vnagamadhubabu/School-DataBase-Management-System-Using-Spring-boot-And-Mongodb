package com.schoolapp.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.schoolapp.app.model.teachers;

public interface teachersRepository extends MongoRepository<teachers, Integer>{

}
