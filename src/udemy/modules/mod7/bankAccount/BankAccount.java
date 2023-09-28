package udemy.modules.mod7.bankAccount;

public class BankAccount {

    private String accountNumber;
//    private String accountNumber = "12345";
    private double accountBalance;
//    private double accountBalance = 13.56;
    private String customerName;
//    private String customerName = "Noah Jones";
    private String customerEmail;
//    private String customerEmail = "noah.jones@gmail.com";
    private String customerPhone;
//    private String customerPhone = "+44 (0) 7123 456789";

    public BankAccount(String number, double accountBalance, String customerName, String email, String phone) {
        System.out.println("Account constructor with parameters called.");
        this.accountNumber = number;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;
    }

    public void depositFunds(double depositAmount) {
        accountBalance += depositAmount;
        System.out.println("Deposit of £" + depositAmount + " made. New balance is £" + accountBalance);
//        System.out.println("Deposit of £" + depositAmount + " made. New balance is £" + this.accountBalance);
//        this.accountBalance 'this' was not necessary as not passing parameter named 'accountBalance' nor declared any local variable with that name.
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (accountBalance - withdrawalAmount < 0) {
            System.out.println("Insufficient funds! You only have £" + accountBalance + " in your account.");
        } else {
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of £" + withdrawalAmount + " processed. Remaining balance is £" + accountBalance + ".");
        }

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

}

