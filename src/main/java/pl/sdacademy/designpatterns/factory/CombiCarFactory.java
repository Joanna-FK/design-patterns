package pl.sdacademy.designpatterns.factory;


import pl.sdacademy.designpatterns.factory.car.*;

// A4 -> Audi A4,diesel, 2,5 diesel, 6c
// A6 -> audi A6, diesel, 3.3, 8c
// TC -> Toyota corolla, benzyna, 2.0, 4c
public class CombiCarFactory implements AbstractFactory <Car> {
    @Override
    public Car create(String type) {
        switch (type) {
            case "A4":
                return createAudiA4Combi();
            case "A6":
                return createAudiA6Combi();
            case "TC":
                return createToyotaCorollaCombi();
        }
        throw new RuntimeException("Unknown sedan type");
    }

    private Car createAudiA4Combi (){
        return new Audi("A4", EngineType.DIESEL, 2.5, 6, BodyType.COMBI );
    }
    private Car createAudiA6Combi(){
        return new Audi ("A6", EngineType.DIESEL, 3.3, 8, BodyType.COMBI);

    }
    private Car createToyotaCorollaCombi (){
        return new Toyota("TC", EngineType.GASOLINE_NATURALLY_ASPIRATED, 2.0, 4, BodyType.COMBI);
    }

  }
