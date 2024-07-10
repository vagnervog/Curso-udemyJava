/* 4 - Fazer um programa que leia o número de um funcionário,
 seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário.
 A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais.
*/

import java.util.Locale;
import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int funcionario;
        double horas, valorHora, salario;

        funcionario = sc.nextInt();
        horas = sc.nextDouble();
        valorHora = sc.nextDouble();

        salario = horas * valorHora;
        System.out.println("Funcionário número:" + funcionario);
        System.out.printf("Salário: %.2f", salario);
    }
}
