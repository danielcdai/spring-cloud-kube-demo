package com.example.kube.demo.dao;

import com.example.kube.demo.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {

    @Query("{ 'name' : ?0 }")
    Person findPersonByName(String name);

}
