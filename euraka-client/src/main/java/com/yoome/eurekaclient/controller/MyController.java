package com.yoome.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/client")
    public String show(@RequestParam(value = "name", defaultValue = "yoome") String name) {
        return "hello " + name + ", service from port " + port;
    }
}
