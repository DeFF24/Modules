package practice4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {

    @Test
    void getMax() {
        int[] array = {1, 4, 3, 2};
        int expected = 4;
        int actual = Arrays.getMax(array);
        assertEquals(expected, actual, "Method getMax error");
    }

    @Test
    void getLastIndexOfValueInArray() {
        int[] array = {1, 4, 3, 2};
        int value = 4;
        int expected = 1;
        int actual = Arrays.getLastIndexOfValueInArray(array, value);
        assertEquals(expected, actual, "Method getLastIndexOfValueInArray error");
    }

    @Test
    void changeEvenIndexedElementToZero() {
        int[] array = {1, 4, 3, 2};
        int[] expected = {0, 4, 0, 2};
        int[] actual = Arrays.changeEvenIndexedElementToZero(array);
        assertArrayEquals(expected, actual, "Method changeEvenIndexedElementToZero error");
    }

    @Test
    void isSequenceIncreasing() {
        int[] array = {1, 4, 3, 2};
        boolean expected = false;
        boolean actual = Arrays.isSequenceIncreasing(array);
        assertEquals(expected, actual, "Method isSequenceIncreasing error");
    }

    @Test
    void getAverageOfArray() {
        int[] array = {1, 4, 3, 2};
        int expected = 2;
        int actual = Arrays.getAverageOfArray(array);
        assertEquals(expected, actual, "Method getAverageOfArray error");
    }
}