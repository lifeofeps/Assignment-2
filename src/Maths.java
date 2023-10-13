// Maths.java
public class Maths {
    public int[]
generateFibonacci(int n) {
        int[] fibonacciSequence = new int[n];
        if (n >= 1) {
            fibonacciSequence[0] = 0;
        }
        if (n >= 2) {
            fibonacciSequence[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }
        return fibonacciSequence;
    }
}