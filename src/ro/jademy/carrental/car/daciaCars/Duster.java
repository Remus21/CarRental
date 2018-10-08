package ro.jademy.carrental.car.daciaCars;


import ro.jademy.carrental.car.CarTypes;
import ro.jademy.carrental.car.Engine;
import ro.jademy.carrental.car.Transmision;


import java.math.BigDecimal;
import java.util.Date;

public class Duster extends Dacia {

    public Duster(String make, String model, Integer year, CarTypes carType, Integer doorNumber, String color, Transmision transmissionType, Engine engine, BigDecimal basePrice, boolean isRented) {
        super(make, model, year, carType, doorNumber, color, transmissionType, engine, basePrice, isRented);
    }
}
