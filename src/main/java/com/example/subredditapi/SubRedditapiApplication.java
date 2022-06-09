package com.example.subredditapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.kafka.core.KafkaTemplate;


@EntityScan(basePackages = {"com.example.subredditapi"})
@EnableJpaRepositories(basePackages = {"com.*"})
@SpringBootApplication
public class SubRedditapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubRedditapiApplication.class, args);
    }

}
