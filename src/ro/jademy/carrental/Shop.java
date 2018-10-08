package ro.jademy.carrental;

import ro.jademy.carrental.car.*;
import ro.jademy.carrental.car.audiCars.*;
import ro.jademy.carrental.car.daciaCars.Duster;
import ro.jademy.carrental.car.daciaCars.Logan;
import ro.jademy.carrental.car.daciaCars.Sandero;


import java.math.BigDecimal;
import java.util.*;

public class Shop {
    // Q: what fields and methods should this class contain?

    private List<Salesman> salesmanList = new ArrayList<>();
    private List<Car> cars = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public  Shop() {

        // Dacia

        cars.add(new Duster("Dacia", "Duster", 2014, CarTypes.SUV, 5, "Green",
                Transmision.AUTOMATIC, new Engine(1.6, FuelType.DIESEL, 110),
                new BigDecimal(1600), true));

        cars.add(new Logan("Dacia", "Logan", 2008, CarTypes.HATCHBACK, 5, "Black",
                Transmision.MANUAL, new Engine(1.4, FuelType.GASOLINE, 75),
                new BigDecimal(1400), true));

        cars.add(new Sandero("Dacia", "Sandero", 2010, CarTypes.HATCHBACK, 5, "Black",
                Transmision.MANUAL, new Engine(1.4, FuelType.DIESEL, 85),
                new BigDecimal(1450), false));


        // Audi

        cars.add(new A6("Audi", "A6", 2014, CarTypes.SEDAN, 5, "Black",
                Transmision.AUTOMATIC, new Engine(3.0, FuelType.DIESEL, 258),
                new BigDecimal(3333), true));

        cars.add(new A7("Audi", "A7", 2015, CarTypes.SEDAN, 5, "Red",
                Transmision.AUTOMATIC, new Engine(3.0, FuelType.GASOLINE, 313),
                new BigDecimal(3555), false));

        cars.add(new S8("Audi", "S8", 2014, CarTypes.SEDAN, 5, "Black",
                Transmision.AUTOMATIC, new Engine(4.2, FuelType.GASOLINE, 512),
                new BigDecimal(5000), true));
    }



    public boolean login() {

        // TODO: implement a basic user login


        String username = askUser();
        for (Salesman salesman : salesmanList) {
            if (salesman.getUsername().equals(username)) {
                String password = askPass();
                if (salesman.getPassword().equals(password)) {
                    showSuccesFullLogin();
                    return true;
                }
            }
        }

        return false;
    }

    public void start() {

        initEmployees();

        if (login()) {
            showMenu();
            checkOptionsMenu();
        } else showConnectionFailed();


    }

    public void showSuccesFullLogin() {

        System.out.println(" -----------------------------------------------");
        System.out.println("|             Successful login                 |");
        System.out.println(" -----------------------------------------------");

    }

    public void showConnectionFailed() {


        System.out.println(" -----------------------------------------------");
        System.out.println("|            Connection Failed                 |");
        System.out.println(" -----------------------------------------------");

    }

//    public void showHeader(){
//
//        String header = String.format("|| %-10s || %-10s || %-10s || %-10s || %-10s || %-10s || %-10s || %-15s " +
//                "|| %-15s || %-15s || %-10s || %-10s ||", "Make", "Model", "Year", "CarType", "DoorNumber",
//                "Color", "Transmission", "Engine (Capacity / FuelType / HorsePower)", "BasePrice", "Available");
//
//
//        String header1 = String.format("|| %-38s || %-12s || %-12s ||", " ", "Capacity", "FuelType","HorsePower");
//        System.out.println("------------------------------------------------------------------------------------------" +
//                "-----------------------------------------------------------------------------------------");
//        System.out.println(header);
//        System.out.println("------------------------------------------------------------------------------------------" +
//                "-----------------------------------------------------------------------------------------");
//        System.out.println(header1);
//        System.out.println("==========================================================================================" +
//                "=========================================================================================");
//        System.out.println(header);
//    }

    public void initEmployees() {

        Salesman salesman1 = new Salesman("Remus", "Irimia", "remus", "1234");
        Salesman salesman2 = new Salesman("Ion", "Ionescu", "ion", "4321");

        Collections.addAll(salesmanList, salesman1, salesman2);


    }


    public String askUser() {

        System.out.println("UserName");
        String username = sc.next();
        return username;
    }

    public String askPass() {


        System.out.println("Password");
        String password = sc.next();
        return password;

    }


    public void showMenu() {

        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the Jademy Car Rental Service  |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. Check income");
        System.out.println("5. Show List Menu Options");
        System.out.println("6. Exit");
    }

    public void checkOptionsMenu(){

        switch (sc.nextInt()){

            case 1: {
                listAllCars();

                break;
            }

            case 2: {
                listAvailableCars();

                break;
            }
            case 3: {
                listRentedCars();

                break;
            }
            case 4: {
                checkIncome();
                break;
            }
            case 5: {
                showListMenuOptions();
                checkListMenuOptions();
            }
            case 6: {
                System.exit(0);
            }
            default:break;
        }
    }

    public void listAllCars(){

        // showHeader();
        for (Car car : cars){
            car.showCarDetails();
        }


    }

    public void listAvailableCars(){

       // showHeader();
        for (Car car : cars) {
            if (car.isAvailableCar()) {
                car.showCarDetails();
            }
        }

    }

    public void listRentedCars(){

       // showHeader();
        for(Car car : cars){
            if (!car.isAvailableCar()){
                car.showCarDetails();
            }
        }
    }

    public void checkIncome(){


    }



    public void showListMenuOptions() {

        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        // TODO: add additional filter methods based on car specs

        System.out.println("4. Back to previous menu");

    }

    public void checkListMenuOptions(){

        switch (sc.nextInt()){

            case 1: {
                filterMake();

                break;
            }

            case 2: {
                filterModel();

                break;
            }
            case 3: {
                filterBudget();

                break;
            }
            case 4: {
                backMenu();
                break;
            }

            default:break;
        }
    }

    public void filterMake(){

        System.out.println();
        System.out.println("Introduceti masina dorita: ");
        String makeCar = sc.next();
        //showHeader();
        for (Car car : cars) {
            if (car.getMake().equals(makeCar)) {
                car.showCarDetails();
            }
        }
    }

    public void filterModel(){

        System.out.println();
        System.out.println("Introduceti modelul dorit:");
        String modelCar = sc.next();
        //showHeader();
        System.out.println();
        for (Car car : cars) {
            if (car.getModel().equals(modelCar)) {
                car.showCarDetails();
            }
        }

    }

    public void filterBudget(){

        System.out.println("Introduceti pretul :");
        BigDecimal option = sc.nextBigDecimal();
        List<Car> sublist = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBasePrice().equals(option)) {
                sublist.add(car);
            }
        }
        for (Car car : sublist) {
            car.showCarDetails();
        }



    }

    public void backMenu(){
        showMenu();
    }




    public void calculatePrice(int numberOfDays) {
        // TODO: apply a discount to the base price of a car based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }


}
