package com.simon.curso.springboot.app.interceptor.springboot_interceptor.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/app")
public class FooController {

    @GetMapping("foo")
    public Map<String, String> foo() {
        return Collections.singletonMap("message", "Handler del controlador foo");
    }

    @GetMapping("bar")
    public Map<String, String> bar() {
        return Collections.singletonMap("message", "Handler del controlador bar");
    }

    @GetMapping("baz")
    public Map<String, String> baz() {
        return Collections.singletonMap("message", "Handler del controlador baz");
    }
    
}
