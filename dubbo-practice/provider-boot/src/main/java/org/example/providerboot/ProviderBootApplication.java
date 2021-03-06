package org.example.providerboot;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableDubbo
public class ProviderBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderBootApplication.class, args);
    }

}
