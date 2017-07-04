package com.szeman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.*;

@RestController
public class SzemController {

    @RequestMapping("/szem")
    public String whoIsTheBoy(){
        return "Szem";
    }

    @RequestMapping("/szem/aaa")
    public List<String> list() {
        List<String> listOfString = new ArrayList<String>();
        listOfString.add("One");
        listOfString.add(UUID.randomUUID().toString());
        listOfString.add(LocalDateTime.now().toString());
        return listOfString;
    }

    @RequestMapping("/szem/map")
    public Map<String, String> map(){
        Map<String, String> map = new HashMap<>();
        map.put("A", UUID.randomUUID().toString());
        map.put("B", "Hello");
        return map;
    }

    @RequestMapping("/szem/emp")
    public Employee Employee(){
        return new Employee ("Szemi");
    }
}

