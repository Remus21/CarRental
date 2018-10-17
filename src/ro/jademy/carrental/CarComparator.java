package ro.jademy.carrental;

import ro.jademy.carrental.car.Car;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {

        if (car1.getMake().compareToIgnoreCase(car2.getMake()) != 0) {
            return car1.getMake().compareToIgnoreCase(car2.getMake());
        }

        if (car1.getModel().compareToIgnoreCase(car2.getModel()) != 0) {
            return car1.getModel().compareToIgnoreCase(car2.getModel());
        }

        if (car1.getYear().compareTo(car2.getYear()) != 0) {
            return car1.getYear().compareTo(car2.getYear());
        }

        if (car1.getCarType().compareTo(car2.getCarType()) != 0) {
            return car1.getCarType().compareTo(car2.getCarType());
        }

        if (car1.getDoorNumber().compareTo(car2.getDoorNumber()) != 0) {
            return car1.getDoorNumber().compareTo(car2.getDoorNumber());
        }

        if (car1.getColor().compareTo(car2.getColor()) != 0) {
            return car1.getColor().compareTo(car2.getColor());
        }

        if (car1.getTransmissionType().compareTo(car2.getTransmissionType()) != 0) {
            return car1.getTransmissionType().compareTo(car2.getTransmissionType());
        }

        if (car1.getEngine().compareTo(car2.getEngine()) != 0) {
            return car1.getEngine().compareTo(car2.getEngine());
        }

        if (car1.getBasePrice().compareTo(car2.getBasePrice()) != 0) {
            return car1.getBasePrice().compareTo(car2.getBasePrice());
        }


        return 0;
    }
}
