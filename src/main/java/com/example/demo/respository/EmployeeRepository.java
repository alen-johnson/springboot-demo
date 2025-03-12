package com.example.demo.respository;

import com.example.demo.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface EmployeeRepository extends MongoRepository<Employee, String > {
}
