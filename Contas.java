import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contas {
    public static void main(String[] args) {

    }

    class Conta {
        private int numero;
        private double saldo;

        public Conta(int numero) {
            this.numero = numero;
            this.saldo = 0.0;
        }

        public int getNumero() {
            return numero;
        }

        public double getSaldo() {
            return saldo;
        }

        public void depositar(double valor) {
            saldo += valor;
        }

        public void transferir(double valor, Conta destino) {
            if (saldo >= valor) {
                saldo -= valor;
                destino.depositar(valor);
            } else {
                System.out.printf("Valor indisponível!\n");
            }
        }

        public void sacar(double valor) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.printf("Valor de %.2f sacado com sucesso!\n", valor);
            } else {
                System.out.printf("Saldo insuficiente!\n");
            }
        }
    }

    class Correntista {
        private String nome;
        private String cpf;
        private List<Conta> contas;

        public Correntista(String nome, String cpf) {
            this.nome = nome;
            this.cpf = cpf;
            this.contas = new ArrayList<>();
        }

        public String getNome() {
            return nome;
        }

        public String getCpf() {
            return cpf;
        }

        public List<Conta> getContas() {
            return contas;
        }

        public void adicionarConta(Conta conta) {
            this.contas.add(conta);
        }

        public Conta getConta(int numero) {
            for (Conta conta : contas) {
                if (conta.getNumero() == numero) {
                    return conta;
                }
            }
            return null;
        }

        public void removerConta(int numero) {
            Conta conta = getConta(numero);
            if (conta != null) {
                this.contas.remove(conta);
            }
        }
    }

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
            Conta conta = new Conta(numeroConta);

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

}
