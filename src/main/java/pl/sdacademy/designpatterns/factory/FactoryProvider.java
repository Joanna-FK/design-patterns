package pl.sdacademy.designpatterns.factory;

<<<<<<< HEAD
import pl.sdacademy.designpatterns. factory.car.Car;
=======
import pl.sdacademy.designpatterns.factory.car.Car;
>>>>>>> 05ca15a171495bdb6b51904dce0765dac25d3859
import pl.sdacademy.designpatterns.factory.car.FactoryCategory;

public class FactoryProvider {

<<<<<<< HEAD
    public AbstractFactory<Car> createFactory (FactoryCategory category){
        switch (category){
            case COMBIS:
                return new CombiCarFactory();
            case SEDANS:
                return new SedanCarFactory();
        }
        throw new RuntimeException("Unknown factory type");
    }
=======
  public AbstractFactory<Car> createFactory(final FactoryCategory category) {
    switch (category) {
      case COMBIS:
        return new CombiCarFactory();
      case SEDANS:
        return new SedanCarFactory();
    }
    throw new RuntimeException("Unknown factory type");
  }
>>>>>>> 05ca15a171495bdb6b51904dce0765dac25d3859
}
