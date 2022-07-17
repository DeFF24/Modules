package practice3.hw1;

public class Task1 {
    public static int sumNums(String str) {
        int sum = 0;
        char[] array = str.toCharArray();
        for (char i : array) {
            if (Character.isDigit(i)) {
                sum += Character.getNumericValue(i);
            }
        }
        return sum;
    }
}
