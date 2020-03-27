package com.example.backoffice.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cms/admin")
public class AdminController {

    private static final Logger LOGGER = LogManager.getLogger(AdminController.class);

    @GetMapping("/notification")
    public String notificationServiceReady(@RequestParam(name = "ready") Boolean isReady) {
        LOGGER.info("Notification Service is {}!", isReady ? "ONLINE" : "OFFLINE");
        return "Received";
    }

}
