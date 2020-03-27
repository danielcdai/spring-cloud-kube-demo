package com.example.notification.controller;

import com.example.notification.model.NewPost;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/notification/post")
public class PostNotificationController {

    private static final Logger LOGGER = LogManager.getLogger(PostNotificationController.class);

    @PostMapping("/new")
    public String newPostNotification(@RequestBody NewPost newPost) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String postTime = simpleDateFormat.format(new Date());
        LOGGER.info("Post {} from {} is received!", newPost.getName(), newPost.getAuthor());
        return "Received";
    }

}
