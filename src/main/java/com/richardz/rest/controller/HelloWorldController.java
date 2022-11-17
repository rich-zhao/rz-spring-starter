package com.richardz.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.richardz.rest.model.Person;

import lombok.extern.slf4j.Slf4j;

/**
 * Sample Controller for various REST-based tasks
 */
@Slf4j
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String get() {
        return "Hello, I am alive";
    }

    @PostMapping("/restTest")
    public Person echoRequest(@RequestBody Person person) {
        log.info("Person first name: {}", person.getFirstName());
        log.info("Person last name: {}", person.getLastName());
        return person;
    }

}
