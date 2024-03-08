import javax.sound.midi.SysexMessage;
import java.util.Scanner;

import static entities.Fibonacci.verificaFibonacci;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para verificar se pertence á sequência de Fibonnaci: ");
        int numero = sc.nextInt();


        if(verificaFibonacci(numero)){
            System.out.println("O número " + numero + " pertence á sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + "não pertence á sequência de Fibonnaci.");
        }

            sc.close();

        }
    }
