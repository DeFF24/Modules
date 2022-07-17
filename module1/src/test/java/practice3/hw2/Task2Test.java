package practice3.hw2;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void countChars() {
        String str = "1w4tt!7";
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('w', 1);
        expected.put('t', 2);
        Map<Character, Integer> actual = Task2.countChars(str);
        assertEquals(expected, actual, "Method countChars error");
    }
}