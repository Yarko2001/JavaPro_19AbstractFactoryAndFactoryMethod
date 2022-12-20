package pattern_abstractfactory;

/**
 * @author Yaroslav Dehtiar on 16.12.2022
 */
public class DefaultCarFactory {

  public static Car buildCar(CarType model) {
    Car car = null;
    switch (model) {
      case MICRO:
        car = new MicroCar(Location.DEFAULT);
        break;

      case MINI:
        car = new MIniCar(Location.DEFAULT);
        break;

      case LUXURY:
        car = new LuxuryCar(Location.DEFAULT);
        break;

      default:
        break;

    }
    return car;
  }

}
