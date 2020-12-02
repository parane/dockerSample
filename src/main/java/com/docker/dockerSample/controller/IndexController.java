package com.docker.dockerSample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {
    @RequestMapping("/get/msgs")
    public String getMsg() {
        return "hello";
    }
}
