package practice6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @Test
    void changeField() {
        Box box = new Box();
        box.value = 100;
        int expected = 100;
        int actual = box.value;
        assertEquals(expected, actual, "Method changeField error");
    }

    @Test
    void constructor() {
        Box box = new Box(100);
        int expected = 100;
        int actual = box.value;
        assertEquals(expected, actual, "Method constructor error");
    }
}