/* A 1001 - Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A
e B atribuindo o seu resultado na variável X. Imprima X conforme exemplo apresentado
abaixo. Não apresente mensagem alguma além daquilo que está sendo especificado e não
esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá
"Presentation Error".*/

import java.util.Scanner;

public class treinoA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = A + B;
        System.out.println("X = " + X);
        sc.close();
    }
}
