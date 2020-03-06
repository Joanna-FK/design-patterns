package pl.sdacademy.designpatterns.factory;

<<<<<<< HEAD
import pl.sdacademy.designpatterns.factory.AbstractFactory;
import pl.sdacademy.designpatterns.factory.car.*;

public class SedanCarFactory implements AbstractFactory<Car> {

    // A4 -> Audi A4,diesel, 1,9 diesel, 4c
    // A6 -> audi A6, diesel, 2.7, 6c
    // TC -> Toyota corolla, benzyna, 1.8, 4c
    @Override
    public Car create(String type) {
        switch (type){
            case "A4":
                return createAudiA4Sedan();
            case "A6":
                return createAudiA6Sedan();
            case "TC":
                return createToyotaCorollaSedan();
        }
        throw new RuntimeException("Unknown sedan type");
    }

    private Car createAudiA4Sedan(){
        return new Audi("A4", EngineType.DIESEL, 1.9, 4, BodyType.SEDAN);
    }

    private Car createAudiA6Sedan(){
        return new Audi ("A6", EngineType.DIESEL, 2.7, 6, BodyType.SEDAN);
    }
    private Car createToyotaCorollaSedan(){
        return new Toyota("Corolla", EngineType.GASOLINE_NATURALLY_ASPIRATED, 1.8, 4, BodyType.SEDAN);
    }
=======
import pl.sdacademy.designpatterns.factory.car.Audi;
import pl.sdacademy.designpatterns.factory.car.BodyType;
import pl.sdacademy.designpatterns.factory.car.Car;
import pl.sdacademy.designpatterns.factory.car.EngineType;
import pl.sdacademy.designpatterns.factory.car.Toyota;

public class SedanCarFactory implements AbstractFactory<Car> {

  // A4 -> audi A4, diesel, 1.9 DIESEL, 4c
  // A6 -> audi A6, diseel 2.7, 6c
  // TC -> toyota corolla, 1.8 beznyna, 4c

  @Override
  public Car create(final String type) {
    switch (type) {
      case "A4":
        return createAudiA4Sedan();
      case "A6":
        return createAudiA6Sedan();
      case "TC":
        return createToyotaCorollaSedan();
    }
    throw new RuntimeException("Unknown sedan type");
  }

  private Car createAudiA4Sedan() {
    return new Audi("A4", EngineType.DIESEL,
        1.9, 4, BodyType.SEDAN);
  }

  private Car createAudiA6Sedan() {
    return new Audi("A6", EngineType.DIESEL,
        2.7, 6, BodyType.SEDAN);
  }

  private Car createToyotaCorollaSedan() {
    return new Toyota("Corolla", EngineType.GASOLINE_NATURALLY_ASPIRATED,
        1.8, 4, BodyType.SEDAN);
  }

>>>>>>> 05ca15a171495bdb6b51904dce0765dac25d3859
}
