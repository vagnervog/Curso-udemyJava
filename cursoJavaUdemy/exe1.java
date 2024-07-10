
/* 1- Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos.

public class exe1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = -30;
        int d = 0;
        int soma = a + b;
        int resultado = c + a;
        int somatorio = d + d;

        System.out.println("A soma dos valores é = " + soma);
        System.out.println("A soma dos valores é = " + resultado);
        System.out.println("A soma dos valores é = " + somatorio);
    }
}
        CORRIGIDO ABAIXO    */

import java.util.Scanner;

public class exe1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();

        soma = A + B;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
