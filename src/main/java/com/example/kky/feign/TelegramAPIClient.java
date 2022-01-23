package com.example.kky.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="telegram", url="https://api.telegram.org/bot5112580382:AAGcb-nF-UkDf1rcfVyW9kPKkwINzyeWLsc")
public interface TelegramAPIClient {

    @GetMapping(value = "/sendmessage")
    Object sendMessage(@RequestParam("text") String text, @RequestParam("chat_id") String chatId);
}
