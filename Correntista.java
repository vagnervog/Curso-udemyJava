import java.util.ArrayList;
import java.util.List;

public class Correntista {
    private String nome;
    private String cpf;
    private List<Conta> contas;

    public Correntista() {
        this.contas = new ArrayList<>();
    }

    public Correntista(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
