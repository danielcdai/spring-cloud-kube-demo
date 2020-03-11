package com.example.kube.demo.service.impl;

import com.example.kube.demo.dao.PersonRepository;
import com.example.kube.demo.exception.PersonException;
import com.example.kube.demo.model.Person;
import com.example.kube.demo.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person getPersonByName(String name) throws PersonException {
        return personRepository.findById(name).orElseThrow(PersonException::new);
    }

    @Override
    public boolean savePerson(Person person) throws PersonException {
        if (person.getName().isEmpty()) {
            return false;
        }
        Optional<Person> personOptional = personRepository.findById(person.getName());
        if (personOptional.isPresent()) {
            throw new PersonException("Name Exist!");
        }
        personRepository.save(person);
        return true;
    }
}
