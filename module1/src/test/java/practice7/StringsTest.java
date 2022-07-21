package practice7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringsTest {

    @Test
    void endWithString() {
        String str = "Test String";
        String substring = "ing";
        boolean expected = true;
        boolean actual = Strings.endWithString(str, substring);
        assertEquals(expected, actual, "Method endWithString error");
    }

    @Test
    void stringContainsSubstring() {
        String str = "Test String";
        String substring = "Str";
        boolean expected = true;
        boolean actual = Strings.stringContainsSubstring(str, substring);
        assertEquals(expected, actual, "Method stringContainsSubstring error");
    }

    @Test
    void stringContainsSubstringNoCase() {
        String str = "Test String";
        String substring = "str";
        boolean expected = true;
        boolean actual = Strings.stringContainsSubstringNoCase(str, substring);
        assertEquals(expected, actual, "Method stringContainsSubstringNoCase error");
    }

    @Test
    void startWithString() {
        String str = "Test String";
        String substring = "Test";
        boolean expected = true;
        boolean actual = Strings.startWithString(str, substring);
        assertEquals(expected, actual, "Method startWithString error");
    }
}