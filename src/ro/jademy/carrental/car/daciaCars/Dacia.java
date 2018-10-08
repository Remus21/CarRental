package ro.jademy.carrental.car.daciaCars;

import ro.jademy.carrental.car.*;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Dacia extends Car {

    public Dacia(String make, String model, Integer year, CarTypes carType, Integer doorNumber, String color,
                 Transmision transmissionType, Engine engine, BigDecimal basePrice, boolean isRented) {
        super(make, model, year, carType, doorNumber, color, transmissionType, engine, basePrice, isRented);
    }
}

