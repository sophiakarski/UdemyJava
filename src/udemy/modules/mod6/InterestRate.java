package udemy.modules.mod6;
public class InterestRate {
    public static void main(String[] args) {
//        i = '(loop) iteration variable'
        for (double rate = 7.5; rate <= 10; rate += 0.25) {
            double interestAmount = calculateInterest(100.00, rate);

//            if (interestAmount < 10) {
//                break;
//            }

            System.out.println("£100.00 at " + rate + "% interest = £" + interestAmount);
        }
    }

    public static double calculateInterest(double amount, double rate) {
        return (amount * (rate / 100));
    }
}
