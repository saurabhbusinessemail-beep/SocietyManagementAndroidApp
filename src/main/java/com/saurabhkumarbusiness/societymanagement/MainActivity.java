package com.saurabhkumarbusiness.societymanagement;

import android.content.Intent;
import android.os.Bundle;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // Handle notification click when app is launched from notification
    handleNotificationIntent(getIntent());
  }

  @Override
  public void onNewIntent(Intent intent) {
    super.onNewIntent(intent);
    setIntent(intent);
    handleNotificationIntent(intent);
  }

  private void handleNotificationIntent(Intent intent) {
    // This method is called when app is opened from notification
    // The Capacitor Push Notifications plugin will automatically
    // handle the notification data and trigger the appropriate listeners
    // in your Angular/JavaScript code

    if (intent != null && intent.getExtras() != null) {
      // Log for debugging
      System.out.println("App opened with intent extras: " + intent.getExtras().toString());

      // The PushNotifications plugin in JavaScript will receive this
      // and trigger the 'pushNotificationActionPerformed' listener
    }
  }
}
