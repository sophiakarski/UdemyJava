package udemy.modules.mod6;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            if (((number % 10) % 2) == 0) { // test for last digit is even
                sum += number % 10; // take out last digit
            }
            number /= 10; // take out last digit to test next digit
        }
        return sum;
    }
}
