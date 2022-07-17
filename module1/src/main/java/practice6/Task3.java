package practice6;

public class Task3 {
    public static int recursiveMultiplication(int n, int m) {
        if (m < 0) return -recursiveMultiplication(n, -m);
        if (m == 1) return n;
        if ((m & 1) == 1)  return n + recursiveMultiplication(n, m - 1);
        return recursiveMultiplication(n, m >> 1) << 1;
    }
}
