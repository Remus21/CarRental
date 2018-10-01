package ro.jademy.carrental;

import java.util.*;

public class Shop {
    // Q: what fields and methods should this class contain?

    private List<Salesman> salesmanList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public Shop() {


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
        System.out.println("|    Welcome to the Jademy Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. Check income");
        System.out.println("5. Logout");
        System.out.println("6. Exit");
    }

    public void showListMenuOptions() {

        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        // TODO: add additional filter methods based on car specs

        System.out.println("4. Back to previous menu");

    }


    public void calculatePrice(int numberOfDays) {
        // TODO: apply a discount to the base price of a car based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }


}
