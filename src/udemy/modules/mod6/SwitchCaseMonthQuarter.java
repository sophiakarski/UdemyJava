package udemy.modules.mod6;

public class SwitchCaseMonthQuarter {

    public static void main(String[] args) {
        numberSwitch(5);

//        Fixes upper/lower case issues
        String month = "ocToBer";
        String lowerCaseMonth = month.toLowerCase();
        char firstChar = lowerCaseMonth.charAt(0);
        char upperCaseFirstChar = Character.toUpperCase(firstChar);
        String resultMonth = upperCaseFirstChar + lowerCaseMonth.substring(1);

        System.out.println(resultMonth + " is in the " + getQuarter(resultMonth) + " quarter of the year.");
    }

    public static void numberSwitch(int value) {
        switch (value) {
            case 1, 2, 3, 4, 5 -> System.out.println("Value was " + value);
            default -> System.out.println("Value none of 1, 2, 3, 4 nor 5");
        }

//        REPLACED BY ABOVE ENHANCED SWITCH:
//        switch (value) {
//            case 1: case 2: case 3: case 4: case 5:
//                System.out.println("Value was " + value);
//                break;
//            default:
//                System.out.println("Value none of 1, 2, 3, 4 nor 5");
//                break;
//        }

    }

    public static String getQuarter(String resultMonth) {
        return switch (resultMonth) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> "bad";
        };
    }
}
