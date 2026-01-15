package com.saurabhkumarbusiness.societymanagement;

import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    
    private static final String TAG = "MyFirebaseMsgService";
    
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        
        Log.d(TAG, "Message received from: " + remoteMessage.getFrom());
        
        // Check if message contains a notification payload
        if (remoteMessage.getNotification() != null) {
            Log.d(TAG, "Notification Body: " + remoteMessage.getNotification().getBody());
        }
        
        // Check if message contains a data payload
        if (remoteMessage.getData().size() > 0) {
            Log.d(TAG, "Data payload: " + remoteMessage.getData());
        }
        
        // IMPORTANT: The notification will be automatically delivered to the
        // Capacitor Push Notifications plugin. You don't need to manually forward it.
    }

    @Override
    public void onNewToken(String token) {
        super.onNewToken(token);
        
        Log.d(TAG, "Refreshed token: " + token);
        
        // IMPORTANT: The Capacitor Push Notifications plugin automatically
        // handles token refresh and triggers the 'registration' event in JavaScript
    }
}