package com.example.firebasenotifications

data class PushNotification(
    val data: NotificationData,
    val to: String
)