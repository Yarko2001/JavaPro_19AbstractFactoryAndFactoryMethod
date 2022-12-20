package pattern_factorymethod;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Yaroslav Dehtiar on 20.12.2022
 */
public class NotificationFactoryTest {

  @Test
  public void createNotification() {
    NotificationFactory notificationFactory = new NotificationFactory();
    Notification SmsNotification = notificationFactory.createNotification("SMS");
    Notification EmailNotification = notificationFactory.createNotification("EMAIL");
    Notification PushNotification = notificationFactory.createNotification("PUSH");
    SmsNotification.notifyUser();
    EmailNotification.notifyUser();
    PushNotification.notifyUser();
  }
}