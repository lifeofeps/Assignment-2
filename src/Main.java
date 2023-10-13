// Main.java
public class Main {
    public static void main(String[] args) {
        Maths math = new Maths();
        int[] fibonacciSequence = math.generateFibonacci(10);

        System.out.println("FibonacciSequence of the first 10 numbers:");
        for (int i = 0; i< 10; i++)
        {
            System.out.print(fibonacciSequence[i] + " ");
        }
    }
}