package com.first_spring.web2.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public RegistrationDto testPost(@RequestBody RegistrationDto form) {
        return form;
    }

    @GetMapping(path = "test-json")
    public HashMap<String, Object> testJson() {
        HashMap<String, Object> obj = new HashMap<>();
        Map<String, String> userMap = new HashMap<>();
        userMap.put("name", "name");
        userMap.put("email", "email@mail");
        userMap.put("password", "getPassword");
        obj.put("name", "MoSALAH");
        obj.put("email", "Seeeeeeeeeeeeeeeeeeee");
        obj.put("id", 9383);
        obj.put("user", userMap);
        obj.put("tags", List.of("#name", "#new"));

        return obj;
    }

    @GetMapping("test-array")
    public List<List> getRegistrationDto() {

        List<List> main = new ArrayList<List>();
        List<RegistrationDto> list = new ArrayList<RegistrationDto>();
        list.add(new RegistrationDto("MoSALAH", "mail.com", "Passsword"));
        list.add(new RegistrationDto("MoSALAH", "mail.com", "Passsword"));
        list.add(new RegistrationDto("MoSALAH", "mail.com", "Passsword"));
        List<RegistrationDto> list2 = new ArrayList<RegistrationDto>();
        list2.add(new RegistrationDto("hassan", "mail.com", "Passsword"));
        list2.add(new RegistrationDto("hassan", "mail.com", "Passsword"));
        list2.add(new RegistrationDto("hassan", "mail.com", "Passsword"));
        main.add(list);
        main.add(list2);
        return main;
    }

}
