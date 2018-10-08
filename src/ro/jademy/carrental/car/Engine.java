package ro.jademy.carrental.car;

public class Engine {

    private double capacity;
    private FuelType fuelType;
    private int horsePower;

    public Engine(double capacity, FuelType fuelType, int horsePower){

        this.capacity = capacity;
        this.fuelType = fuelType;
        this.horsePower = horsePower;
    }

    public double getCapacity() {

        return capacity;
    }

    public FuelType getFuelType() {

        return fuelType;
    }

    public int getHorsePower() {

        return horsePower;
    }

    @Override
    public String toString() {

        return  "Engine { " + "capacity = "+ capacity +", fuelType = "+ fuelType +", horsePower = "+ horsePower + " }";
    }

//    public String getEngineSpecifications(){
//        String outPut = String.format("%-5s%-5s%-5s",capacity,fuelType, horsePower);
//        return outPut;
//    }
}
