package ro.jademy.carrental.car;

import java.math.BigDecimal;


public abstract class Car {

    // Q: how can we better represent the car make?
    private String make;
    private String model;
    private Integer year;
    private CarTypes carType;

    private Integer doorNumber;
    private String color;
    private Transmision transmissionType;
    private Engine engine;
    private BigDecimal basePrice;
    private boolean availableCar;
    private CarState carState = new CarState();


    public Car(String make, String model, Integer year, CarTypes carType, Integer doorNumber,
               String color, Transmision transmissionType, Engine engine, BigDecimal basePrice, boolean availableCar) {

        this.make = make;
        this.model = model;
        this.year = year;
        this.carType = carType;
        this.doorNumber = doorNumber;
        this.color = color;
        this.transmissionType = transmissionType;
        this.engine = engine;
        this.basePrice = basePrice;
        this.availableCar = availableCar;



    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public CarTypes getCarType() {
        return carType;
    }

    public Integer getDoorNumber() {
        return doorNumber;
    }

    public String getColor() {
        return color;
    }

    public Transmision getTransmissionType() {
        return transmissionType;
    }

    public Engine getEngine() {
        return engine;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public boolean isAvailableCar() {
        return availableCar;
    }

    public CarState getCarState() {
        return carState;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void showCarDetails(){


        String outPut = String.format("|| %-10s || %-10s || %-10s || %-10s || %-10s || %-10s || %-10s || %-12s " +
                        "|| %-12s || %-12s || %-10s || %-10s ||", getMake(), getModel(), getYear(), getCarType(),
                getDoorNumber(), getColor(), getTransmissionType(), getEngine().getCapacity(),
                getEngine().getFuelType(), getEngine().getHorsePower(), getBasePrice(), isAvailableCar());

        System.out.println(outPut);

    }

//    public void rentCar(Date start, Date end){
//        carState.setRented(true);
//        carState.setStartDate(start);
//        carState.setEndDate(end);
//    }
}
