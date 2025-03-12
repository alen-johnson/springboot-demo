package com.example.demo.respository;

import com.example.demo.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "customers")
public interface CustomerRepository extends MongoRepository<Customer, String> {
}
