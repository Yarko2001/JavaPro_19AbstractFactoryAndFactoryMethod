package pattern_factorymethod;

/**
 * @author Yaroslav Dehtiar on 16.12.2022
 */
public class EmailNotification implements Notification{

  @Override
  public void notifyUser() {
    System.out.println("Sending an Email notification...");
  }
}
