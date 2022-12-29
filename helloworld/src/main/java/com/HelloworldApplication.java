package com;

import com.helloworld.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class HelloworldApplication implements CommandLineRunner {

    @Autowired
    private ChatService chatService;

    public static void main(String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Application started..");

        chatService.enterCharRoom("chat1");
    }

}
