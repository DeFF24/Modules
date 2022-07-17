package practice4;

import java.util.ArrayList;
import java.util.Scanner;

import static practice4.Utils.*;

public class Arrays {
    public static void task1() {
        int[] array = initializeArray(12, -15, 15);
        printArray(array);
        int max = getMax(array);
        System.out.printf("%d\t", max);
        System.out.printf("[%d]", getLastIndexOfValueInArray(array, max));
        System.out.println();
    }

    public static void task2() {
        int[] array = initializeArray(8, 1, 10);
        printArray(array);
        int[] changedArray = changeEvenIndexedElementToZero(array);
        printArray(changedArray);
    }

    public static void task3() {
        int[] array = initializeArray(4, 10, 99);
        printArray(array);
        System.out.println(isSequenceIncreasing(array));
    }

    public static void task4() {
        int[] array1 = initializeArray(5, 0, 5);
        int[] array2 = initializeArray(5, 0, 5);
        printArray(array1);
        printArray(array2);
        int averageOfArray1 = getAverageOfArray(array1);
        int averageOfArray2 = getAverageOfArray(array2);
        if (averageOfArray1 > averageOfArray2) {
            System.out.println("Average of array1 > average of array2");
        } else if (averageOfArray2 > averageOfArray1) {
            System.out.println("Average of array2 > average of array1");
        } else {
            System.out.println("Average of array1 = average of array2");
        }
    }

    public static void task5() {
        Scanner in = new Scanner(System.in);
        int input = 0;
        System.out.println("Input number:");
        while (input <= 3) {
            if(in.hasNextInt()){
                input = in.nextInt();
                if (input <= 3) {
                    System.out.println("Input number must be > 3. Input number:");
                }
            } else {
                System.out.println("Input number:");
                in.next();
            }
        }
        int[] array1 = initializeArray(input, 0, input);
        printArray(array1);
        ArrayList<Integer> array2 = new ArrayList<>();
        for (int i : array1) {
            if (i % 2 == 0) {
                array2.add(i);
            }
        }
        for (int i : array2) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public static int getLastIndexOfValueInArray(int[] array, int value) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int[] changeEvenIndexedElementToZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 0;
            }
        }
        return array;
    }

    public static boolean isSequenceIncreasing(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int getAverageOfArray(int[] array) {
        int sum = 0;
        for (int i: array) {
            sum += i;
        }
        return sum / array.length;
    }
}
