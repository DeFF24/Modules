package practice3.hw2;

import java.util.Map;
import java.util.HashMap;

public class Task2 {
    public static Map countChars(String str) {
        char[] array = str.replaceAll("[^a-zA-Zа-яА-ЯёЁїЇіІєЄґҐ]", "").toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch: array) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            map.put(ch, count);
        }
        return map;
    }
}
