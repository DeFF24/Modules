package practice6;

public class Task1 {
    public static int pow(int x) {
        return x * x;
    }

    public static String reverseString(String str) {
        String rightStr;
        String leftStr;
        int length = str.length();
        if (length <= 1) {
            return str;
        }
        leftStr = str.substring(0, length / 2);
        rightStr = str.substring(length / 2, length);
        return reverseString(rightStr) + reverseString(leftStr);
    }
}
