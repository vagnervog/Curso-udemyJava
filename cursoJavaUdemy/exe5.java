/* 5 - Fazer um programa para ler o código de uma peça 1,
o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
 Calcule e mostre o valor a ser pago.
*/

import java.util.Locale;
import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double peca1, peca2, valorUnidade1, valorUnidade2, valorApagar;
        int numPecas1, numPecas2;

        peca1 = sc.nextDouble();
        numPecas1 = sc.nextInt();
        valorUnidade1 = sc.nextDouble();

        peca2 = sc.nextDouble();
        numPecas2 = sc.nextInt();
        valorUnidade2 = sc.nextDouble();

        valorApagar = (valorUnidade1 * numPecas1 + valorUnidade2 * numPecas2);
        System.out.printf("Valor a pagar: R$%.2f%n", valorApagar);
        sc.close();
    }

}
