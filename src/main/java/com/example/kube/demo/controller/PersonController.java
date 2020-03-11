package com.example.kube.demo.controller;

import com.example.kube.demo.model.Person;
import com.example.kube.demo.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @Autowired
    private IPersonService personService;

    @GetMapping("/person/{name}")
    public Person getPersonByName(@PathVariable(value = "name") String name) {
        return personService.getPersonByName(name);
    }

    @PostMapping("/person")
    public boolean savePerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }

}
