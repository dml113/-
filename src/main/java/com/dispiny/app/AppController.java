package com.dispiny.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public String hello() {
        return "version 1.0.0";
    }

    @GetMapping("/long-running")
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(45000); // 10초 대기
        return "version 1.0.0";
    }
}
