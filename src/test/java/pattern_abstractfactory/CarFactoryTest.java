package pattern_abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Yaroslav Dehtiar on 20.12.2022
 */
public class CarFactoryTest {

  @Test
  public void buildCar() {
    CarFactory.buildCar(CarType.MICRO);
    CarFactory.buildCar(CarType.MINI);
    CarFactory.buildCar(CarType.LUXURY);
  }
}