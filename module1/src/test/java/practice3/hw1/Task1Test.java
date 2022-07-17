package practice3.hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void sumNums() {
        String str = "1w4tt!7";
        int expected = 12;
        int actual = Task1.sumNums(str);
        assertEquals(expected, actual, "Method sumNums error");
    }
}