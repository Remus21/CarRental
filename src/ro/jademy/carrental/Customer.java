package ro.jademy.carrental;

public class Customer extends Person {

    public int budget;

    public Customer (String firstName, String lastName, int budget){

        super(firstName, lastName);
        this.budget = budget;
    }

}
