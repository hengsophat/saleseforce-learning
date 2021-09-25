package com.zillennium.middleware;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/")
    public Employee home(){
        Employee e = new Employee();
        e.setName("Sophat");
        return e;
    }
}
