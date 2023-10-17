package udemy.modules.mod9.sortedArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] userArray = getIntegers(5);
        printArray(userArray);
        System.out.println("Sorting in descending order...");
        printArray(sortedIntegers(userArray));
    }
    private static Scanner userInput = new Scanner(System.in);
    public static int[] getIntegers(int number) {
        System.out.print("Enter " + number + " integers: ");
        int[] userArray = new int[number];

        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = userInput.nextInt();
        }
        return userArray;
    }

    public static void printArray(int[] array) {
        System.out.println("The numbers are: " + Arrays.toString(array));
    }

    public static int[] sortedIntegers(int[] array) {
        Arrays.sort(array);
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[array.length -1 - i] = array[i];
        }
        return sortedArray;
    }
}
