package com.brendenvogt.web.models;

import org.springframework.data.annotation.Id;

public class Person {

    @Id
    private String id;
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
