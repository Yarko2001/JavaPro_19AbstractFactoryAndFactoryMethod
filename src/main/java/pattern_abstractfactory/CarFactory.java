package pattern_abstractfactory;

/**
 * @author Yaroslav Dehtiar on 20.12.2022
 */
public class CarFactory {

  public CarFactory() {

  }

  public static Car buildCar(CarType type) {
    Car car = null;

    Location location = Location.INDIA;

    switch (location) {
      case USA:
        car = USACarFactory.buildCar(type);
        break;

      case INDIA:
        car = IndiaCarFactory.buildCar(type);
        break;

      default:
        car = DefaultCarFactory.buildCar(type);

    }

    return car;

  }

}
