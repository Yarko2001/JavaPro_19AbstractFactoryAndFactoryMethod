package pattern_abstractfactory;

/**
 * @author Yaroslav Dehtiar on 16.12.2022
 */
public class USACarFactory {

  public static Car buildCar(CarType model) {
    Car car = null;
    switch (model) {
      case MICRO:
        car = new MicroCar(Location.USA);
        break;

      case MINI:
        car = new MIniCar(Location.USA);
        break;

      case LUXURY:
        car = new LuxuryCar(Location.USA);
        break;

      default:
        break;

    }
    return car;
  }
}
