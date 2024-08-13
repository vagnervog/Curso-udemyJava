/* 2 - Fazer um programa para ler um número inteiro e dizer
 se este número é par ou ímpar */

import java.util.Scanner;

public class exe8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        if (A % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        sc.close();
    }
}
