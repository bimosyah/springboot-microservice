package com.bimo.project.notification.service;

import com.bimo.project.clients.notification.NotificationRequest;

public interface NotificationService {
    public void send(NotificationRequest notificationRequest);
}
