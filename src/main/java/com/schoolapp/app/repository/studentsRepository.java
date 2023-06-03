package com.schoolapp.app.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.schoolapp.app.model.students;

public interface studentsRepository extends MongoRepository<students, Integer>{

}
