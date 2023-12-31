package udemy.modules.mod6;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(-707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number *= -1;
        }

        int reverse = 0;
        int stored = number;
        while (stored > 0) {
            // extract lest-significant digit
            int digit = stored % 10;
            // build reverse number
            reverse = (reverse * 10) + digit;
            // drop lest-significant digit
            stored /= 10; // same as number = number / 10
        }

        return number == reverse;

//        ABOVE IS QUICKER:
//        if (number == reverse) {
//            return true;
//        } return false;

    }

}
