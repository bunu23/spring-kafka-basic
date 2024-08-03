package com.demo.config;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
  @KafkaListener(topics = "demo",
  groupId = "groupId")
   void listener(String data){
      System.out.println("Received" + data);
   }

}
