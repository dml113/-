package com.dispiny.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public String hello() {
        return "Hello, This is Dispiny Grace Application!";
    }

    @GetMapping("/long-running")
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(10000); // 10초 대기
        return "Long running task completed";
    }
}