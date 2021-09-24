package com.brendenvogt.web;

import com.brendenvogt.web.models.Person;
import com.brendenvogt.web.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandLineApplication implements CommandLineRunner {

    @Autowired
    private PersonRepository repository;

    private static void main(String[] args) {
        SpringApplication.run(CommandLineApplication.class, args);
    }

    @Override
    public void run(String... args) {

        repository.deleteAll();

        // save a couple of customers
        repository.save(new Person("Alice", "Smith"));
        repository.save(new Person("Bob", "Smith"));

        // print out customers by last name smith
        System.out.println("Customers found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
        for (Person person : repository.findByLastName("Smith")) {
            System.out.println(person);
            System.out.printf("Person first name: %s, last name: %s%n", person.getFirstName(), person.getLastName());
        }
    }
}
