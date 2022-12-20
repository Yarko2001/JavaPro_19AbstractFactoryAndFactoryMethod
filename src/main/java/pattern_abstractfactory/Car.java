package pattern_abstractfactory;

/**
 * @author Yaroslav Dehtiar on 16.12.2022
 */
public abstract class Car {

  CarType model = null;
  Location location = null;

  abstract void construct();

  public Car(CarType model, Location location) {
    this.model = model;
    this.location = location;
  }

  public CarType getModel() {
    return model;
  }

  public void setModel(CarType model) {
    this.model = model;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  @Override
  public String toString() {
    return "CarModel - "+model + " located in "+location;
  }
}
