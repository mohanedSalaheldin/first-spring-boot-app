package com.first_spring.web2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.first_spring.web2.dto.RegistrationDto;

@RestController
public class TestController {

    // @GetMapping("/test/{id}")
    // public String testMethod(@RequestParam String name, @PathVariable Integer id)
    // {
    // return "First RestController for " + id + " id " + name;
    // }

    @PostMapping(path = "test-post")
    public String testPost(@RequestBody RegistrationDto form) {
        return "name: " + form.getName() + " email: " + form.getEmail() + " Password: " + form.getPassword();
    }
}
