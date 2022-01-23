package com.example.kky;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableBatchProcessing
@EnableFeignClients
@EnableScheduling
public class KkyApplication {

    public static void main(String[] args) {
        SpringApplication.run(KkyApplication.class, args);
    }

}
