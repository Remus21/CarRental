package ro.jademy.carrental.car;

public abstract class Car {

    // Q: how can we better represent the car make?
    public String make;
    public String model;
    public Integer year;

    public Car(String make, String model, Integer year, String carType, String fuelType, Integer doorNumber, String color, String transmissionType, String engine, String basePrice) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.carType = carType;
        this.fuelType = fuelType;
        this.doorNumber = doorNumber;
        this.color = color;
        this.transmissionType = transmissionType;
        this.engine = new Engine();
        this.basePrice = basePrice;
    }

    // Q: how can we better represent the car type?
    public String carType; // coupe, sedan, hatchback, convertible, wagon, SUV

    // Q: how can we better represent the motor type?
    public String fuelType; // diesel, gasoline, alternative

    public Integer doorNumber;

    public String color;

    // Q: how can we better represent the transmission type?
    public String transmissionType; // automatic, manual

    // Q: how can we better represent the engine?
    public Engine engine;

    // Q: how can we better represent money value?
    public String basePrice;

    // Q: do we need a constructor other than the default one?
    // Q: how can we better protect the car data?

    public void setMake(String make) {

        this.make = make;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public void setYear(Integer year) {

        this.year = year;
    }

    public void setCarType(String carType) {

        this.carType = carType;
    }

    public void setFuelType(String fuelType) {

        this.fuelType = fuelType;
    }

    public void setDoorNumber(Integer doorNumber) {

        this.doorNumber = doorNumber;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public void setTransmissionType(String transmissionType) {

        this.transmissionType = transmissionType;
    }

    public void setEngine(Engine engine) {

        this.engine = engine;
    }

    public void setBasePrice(String basePrice) {

        this.basePrice = basePrice;
    }


}
