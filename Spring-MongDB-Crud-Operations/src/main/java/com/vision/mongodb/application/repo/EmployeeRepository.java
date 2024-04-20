package com.vision.mongodb.application.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vision.mongodb.application.documents.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
      
	
}
