package com.example.kube.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {

    private String name;
    private int age;
    private Sex sex;

}
