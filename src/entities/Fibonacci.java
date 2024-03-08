package entities;

public class Fibonacci {

    public static boolean verificaFibonacci(int num){
        int a = 0, b = 1;
        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == num;
    }

}
