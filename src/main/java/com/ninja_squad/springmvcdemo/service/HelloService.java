package com.ninja_squad.springmvcdemo.service;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Fake service just to test that everything works fine
 * @author JB Nizet
 */
@RestController
@RequestMapping("/api/hello")
public class HelloService {

    @RequestMapping(method = GET)
    public HelloMessage sayHello() {
        return new HelloMessage();
    }
}
