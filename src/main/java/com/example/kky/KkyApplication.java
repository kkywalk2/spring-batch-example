package com.example.kky;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class KkyApplication {

    public static void main(String[] args) {
        SpringApplication.run(KkyApplication.class, args);
    }

}
