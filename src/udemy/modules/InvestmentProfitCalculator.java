package udemy.modules;

import java.util.Scanner;

public class InvestmentProfitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of months
        System.out.print("Enter the number of months: ");
        int numberOfMonths = scanner.nextInt();

        // Define the monthly payment amount and annual interest rate
        double monthlyPayment = 100.0; // £100
        double annualInterestRate = 0.07; // 7% annual interest rate

        // Calculate the profit
        double profit = calculateProfit(monthlyPayment, annualInterestRate, numberOfMonths);

        // Display the result
        System.out.println("The profit after " + numberOfMonths + " months is £" + profit);

        // Close the scanner
        scanner.close();
    }

    public static double calculateProfit(double monthlyPayment, double annualInterestRate, int numberOfMonths) {
        // Calculate the monthly interest rate
        double monthlyInterestRate = annualInterestRate / 12.0;

        // Calculate the future value (total amount accumulated) after the specified number of months
        double futureValue = monthlyPayment * ((Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1) / monthlyInterestRate);

        // Calculate the total investment
        double totalInvestment = monthlyPayment * numberOfMonths;

        // Calculate the profit
        double profit = futureValue - totalInvestment;

        return profit;
    }
}
