package udemy.modules.mod7.bankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount firstAccount = new BankAccount("12345", 13.56, "Noah Jonesn", "noah.jones@gmail.com", "+44 (0) 7123 456789");

        System.out.println(firstAccount.getAccountNumber());
        System.out.println(firstAccount.getAccountBalance());
//        ABOVE IS A BETTER WAY OF SETTING ATTRIBUTES UPON CREATION OF A CLASS, USING CONSTRUCTORS
//        firstAccount.setAccountNumber("12345");
//        firstAccount.setAccountBalance(13.56);
//        firstAccount.setCustomerName("Noah Jones");
//        firstAccount.setCustomerEmail("noah.jones@gmail.com");
//        firstAccount.setCustomerPhone("+44 (0) 7123 456789");

        firstAccount.withdrawFunds(100.00);
        firstAccount.depositFunds(250.00);
        firstAccount.withdrawFunds(50);

        System.out.println("Account holder name: " + firstAccount.getCustomerName() + ".");
    }

}
