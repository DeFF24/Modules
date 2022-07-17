package practice3.hw3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void getTime() {
        int lesson = 3;
        String expected = "11:35";
        String actual = Task3.getTime(lesson);
        assertEquals(expected, actual, "Method getTime error");
    }
}