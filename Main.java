import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criar um correntista
        System.out.print("Digite o nome do correntista: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF do correntista: ");
        String cpf = scanner.nextLine();
        Correntista correntista = new Correntista(nome, cpf);

        // Criar uma conta
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        Conta conta = new Conta();

        // Associar a conta ao correntista
        correntista.adicionarConta(conta);

        // Exibir as informações do correntista e da conta
        System.out.println("\nInformações do Correntista e Conta:");
        System.out.println("Nome do Correntista: " + correntista.getNome());
        System.out.println("CPF do Correntista: " + correntista.getCpf());
        System.out.println("Número da Conta: " + conta.getNumero());
        System.out.println("Saldo da Conta: " + conta.getSaldo());

        scanner.close();
    }
}
