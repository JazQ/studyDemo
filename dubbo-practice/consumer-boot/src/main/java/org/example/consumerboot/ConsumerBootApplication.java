package org.example.consumerboot;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ConsumerBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerBootApplication.class, args);
    }

}
