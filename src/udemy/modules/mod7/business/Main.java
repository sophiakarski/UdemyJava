package udemy.modules.mod7.business;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Sophia",
                12345, "sophia@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

//        Default constructor won't get implicitly created if we create any kind of constructor in class.
//        Can't use it this way to create new constructor in class
        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());

        Customer thirdCustomer = new Customer("John", "joe@gmail.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmail());

    }
}
