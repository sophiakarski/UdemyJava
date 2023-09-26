package udemy.modules.mod6;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        // last digit
        int sum = number % 10;

        // first digit
        while (true) {
            if (number < 10) {
                sum += number % 10;
                break;
            }
            number /= 10;
        }
        return sum;
    }

}
