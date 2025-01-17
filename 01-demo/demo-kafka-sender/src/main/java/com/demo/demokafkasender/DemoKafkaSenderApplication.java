package com.demo.demokafkasender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class DemoKafkaSenderApplication implements CommandLineRunner {
@Autowired
Sender sender;
    public static void main(String[] args) {
        SpringApplication.run(DemoKafkaSenderApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        sender.send("topicA","Hello World!");
        System.out.println("Message has been sent..");
    }
}
