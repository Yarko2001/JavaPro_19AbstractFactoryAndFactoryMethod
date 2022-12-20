package pattern_abstractfactory;

/**
 * @author Yaroslav Dehtiar on 16.12.2022
 */
public class MIniCar extends Car {

  public MIniCar(Location location) {
    super(CarType.MINI, location);
    construct();
  }

  @Override
  void construct() {
    System.out.println("Connecting to mini car...");
  }
}
