package pattern_abstractfactory;

/**
 * @author Yaroslav Dehtiar on 16.12.2022
 */
public class LuxuryCar extends Car {

  public LuxuryCar(Location location) {
    super(CarType.LUXURY, location);
    construct();
  }

  @Override
  void construct() {
    System.out.println("Connecting to luxury car...");
  }
}
