package com.example.chatapp;

import com.example.chatapp.Mesage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Controller
public class ChatController {


    @GetMapping("/")  // This will serve your HTML page
    public String chat() {
        return "chat";  // This corresponds to /src/main/resources/templates/index.html
    }
    public Mesage send(Mesage message) {
        System.out.println("Message received: " + message.getContent());
        message.setTime(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
        return message;
    }
}
