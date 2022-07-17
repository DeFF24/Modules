package practice4;

import java.util.Random;

public class Utils {
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    public static int getRandomNumber(int leftBoard, int rightBoard) {
        Random random = new Random();
        return random.nextInt(rightBoard - leftBoard) + leftBoard;
    }

    public static int[] initializeArray(int size, int leftBoard, int rightBoard) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomNumber(leftBoard, rightBoard);
        }
        return array;
    }
}
