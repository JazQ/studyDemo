package org.example.consumerboot.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.example.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Reference
    private TestService testService;


    @GetMapping("/hello")
    void testHello() {
        String jade_z = testService.hello("Jade Z");

        System.out.println(jade_z);
    }
}
