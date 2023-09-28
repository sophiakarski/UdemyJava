package udemy.modules.mod7.business;

public class Customer {

    // MAY BE FINAL?
    private String name;
    private double creditLimit;
    private String email;

    public Customer() {
        this("Leo", "leo@gmail.com");
    }

    public Customer(String name, String email) {
        this(name, 1000, email);
    }

//    constructor w/ all 3 fields, assigning arguments directly to the instance fields
    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

}
