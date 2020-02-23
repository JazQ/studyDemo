package org.example.providerboot.service;

import org.apache.dubbo.config.annotation.Service;
import org.example.service.TestService;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String hello(String name) {
        System.out.println("provider:" + name);
        return "provider:" + name;
    }
}
