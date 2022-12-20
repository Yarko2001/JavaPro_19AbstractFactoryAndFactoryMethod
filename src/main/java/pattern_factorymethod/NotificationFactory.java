package pattern_factorymethod;

/**
 * @author Yaroslav Dehtiar on 16.12.2022
 */
public class NotificationFactory {

  public Notification createNotification(String channel) {
    if (channel == null || channel.isEmpty()) {
      return null;
    }
    switch (channel) {
      case "SMS":
        return new SMSNotification();
      case "EMAIL":
        return new EmailNotification();
      case "PUSH":
        return new PushNotification();
      default:
        throw new IllegalArgumentException("Unknow channel: " + channel);
    }

  }

}
