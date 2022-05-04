package com.bimo.project.notification.controller.impl;

import com.bimo.project.clients.notification.NotificationRequest;
import com.bimo.project.notification.controller.NotificationController;
import com.bimo.project.notification.service.NotificationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NotificationControllerImpl implements NotificationController {

    @Autowired
    NotificationService notificationService;

    @Override
    public void sendNotification(NotificationRequest notificationRequest) {
        log.info("New notification... {}", notificationRequest);
        notificationService.send(notificationRequest);
    }
}
