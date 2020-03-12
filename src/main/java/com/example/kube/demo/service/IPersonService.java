package com.example.kube.demo.service;

import com.example.kube.demo.model.Person;

public interface IPersonService {
    Person getPersonByName(String name);
    boolean savePerson(Person person);
}
