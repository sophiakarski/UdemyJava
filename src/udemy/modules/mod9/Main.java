package udemy.modules.mod9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);

        int [] newArray;
//        newArray = new int[] {5, 4, 3, 2, 1};
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
// SAME THING WITH ENHANCED ARRAY
        for (int element : newArray) {
            System.out.print(element + " ");
        }
        System.out.println();

//        HEXADECIMAL REPRESENTATION OF HASHCODE
        System.out.println(newArray);
//        ELEMENTS PRINTED IN SINGLE STRING
        System.out.println(Arrays.toString(newArray));

        Object objectVariable = newArray;
        if (objectVariable instanceof int[]) {
            System.out.println("objectVariable is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello"; // string literal
        objectArray[1] = new StringBuilder("World"); // string builder instance
        objectArray[2] = newArray; // NESTED ARRAY
        System.out.println(Arrays.toString(objectArray));
//        ... multi-dimensional arrays
    }
}
