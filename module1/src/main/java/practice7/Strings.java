package practice7;

public class Strings {
    public static void task1() {
        String str = "Hello world";
        System.out.println(str.charAt(0));
        int length = str.length();
        System.out.println(str.charAt(length - 1));
        char[] array = str.toCharArray();
        System.out.println(array);
        System.out.println(array[length - 2]);
    }

    public static boolean endWithString(String str, String substring) {
        return str.endsWith(substring);
    }

    public static boolean stringContainsSubstring(String str, String substring) {
        return str.contains(substring);
    }

    public static boolean stringContainsSubstringNoCase(String str, String substring) {
        return str.toLowerCase().contains(substring.toLowerCase());
    }

    public static boolean startWithString(String str, String substring) {
        return str.startsWith(substring);
    }
}
