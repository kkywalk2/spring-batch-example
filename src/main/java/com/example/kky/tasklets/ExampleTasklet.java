package com.example.kky.tasklets;

import com.example.kky.feign.TelegramAPIClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

@Slf4j
public class ExampleTasklet implements Tasklet {

    private final TelegramAPIClient telegramAPIClient;

    public ExampleTasklet(TelegramAPIClient telegramAPIClient) {
        this.telegramAPIClient = telegramAPIClient;
    }

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        log.info("send message start");
        telegramAPIClient.sendMessage("5112580382:AAGcb-nF-UkDf1rcfVyW9kPKkwINzyeWLsc","hello bot", "52940587");
        log.info("send message finished");
        return RepeatStatus.FINISHED;
    }
}
