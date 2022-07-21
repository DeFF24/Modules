package practice7;

public class Task1 {
    public static void task1() {
        String str = "Hello world";
        System.out.println(str.charAt(0));
        int length = str.length();
        System.out.println(str.charAt(length - 1));
        char[] array = str.toCharArray();
        System.out.println(array[length - 2]);
    }
}
