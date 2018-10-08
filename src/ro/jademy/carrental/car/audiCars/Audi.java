package ro.jademy.carrental.car.audiCars;

import ro.jademy.carrental.car.*;

import java.math.BigDecimal;

public class Audi extends Car {

    public Audi(String make, String model, Integer year, CarTypes carType, Integer doorNumber, String color,
                Transmision transmissionType, Engine engine, BigDecimal basePrice, boolean availableCar) {
        super(make, model, year, carType, doorNumber, color, transmissionType, engine, basePrice, availableCar);
    }
}
