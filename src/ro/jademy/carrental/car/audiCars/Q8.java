package ro.jademy.carrental.car.audiCars;

import ro.jademy.carrental.car.CarTypes;
import ro.jademy.carrental.car.Engine;
import ro.jademy.carrental.car.FuelType;
import ro.jademy.carrental.car.Transmision;

import java.math.BigDecimal;
import java.util.Date;

public class Q8 extends Audi {


    public Q8(String make, String model, Integer year, CarTypes carType, Integer doorNumber, String color,
              Transmision transmissionType, Engine engine, BigDecimal basePrice, boolean availableCar) {
        super(make, model, year, carType, doorNumber, color, transmissionType, engine, basePrice, availableCar);
    }
}
