import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }

    private int numero;
    private double saldo;

    public Conta() {

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void transferir(double valor, Conta destino) {
        if (saldo >= valor) {
            saldo = saldo - valor;
            destino.depositar(valor);
        } else
            System.out.printf("Valor indisponível!\n");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
            System.out.printf("Valor de %.2f sacado com sucesso!\n", valor);
        } else {
            System.out.printf("Saldo insuficiente!\n");
        }
    }
}
