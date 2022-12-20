package pattern_abstractfactory;

/**
 * @author Yaroslav Dehtiar on 16.12.2022
 */
public class IndiaCarFactory {

  static Car buildCar(CarType model) {
    Car car = null;
    switch (model) {
      case MICRO:
        car = new MicroCar(Location.INDIA);
        break;

      case MINI:
        car = new MIniCar(Location.INDIA);
        break;

      case LUXURY:
        car = new LuxuryCar(Location.INDIA);
        break;

      default:
        break;

    }
    return car;
  }

}
