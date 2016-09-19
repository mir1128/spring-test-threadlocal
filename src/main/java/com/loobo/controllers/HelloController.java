package com.loobo.controllers;

import com.loobo.utils.HelloThreadLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloThreadLocal helloThreadLocal;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        helloThreadLocal.set();
        return "hello world!";
    }

}
