package ro.jademy.carrental.car.audiCars;

import ro.jademy.carrental.car.CarState;
import ro.jademy.carrental.car.CarTypes;
import ro.jademy.carrental.car.Engine;
import ro.jademy.carrental.car.Transmision;

import java.math.BigDecimal;

public class A6 extends Audi {
    public A6(String make, String model, Integer year, CarTypes carType, Integer doorNumber, String color,
              Transmision transmissionType, Engine engine, BigDecimal basePrice, boolean availableCar) {
        super("Audi", model, year, carType, doorNumber, color, transmissionType, engine, basePrice, availableCar);
    }
}
