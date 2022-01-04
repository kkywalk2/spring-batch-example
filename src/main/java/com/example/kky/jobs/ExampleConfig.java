package com.example.kky.jobs;

import com.example.kky.tasklets.ExampleTasklet;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfig {

    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;

    public ExampleConfig(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory) {
        this.jobBuilderFactory = jobBuilderFactory;
        this.stepBuilderFactory = stepBuilderFactory;
    }

    @Bean
    public Job tutorialJob() {
        return jobBuilderFactory.get("exampleJob")
                .start(tutorialStep())  // Step 설정
                .build();
    }

    @Bean
    public Step tutorialStep() {
        return stepBuilderFactory.get("exampleStep")
                .tasklet(new ExampleTasklet())
                .build();
    }
}
