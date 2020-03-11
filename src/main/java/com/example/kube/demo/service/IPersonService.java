package com.example.kube.demo.service;

import com.example.kube.demo.exception.PersonException;
import com.example.kube.demo.model.Person;

public interface IPersonService {
    Person getPersonByName(String name) throws PersonException;
    boolean savePerson(Person person) throws PersonException;
}
