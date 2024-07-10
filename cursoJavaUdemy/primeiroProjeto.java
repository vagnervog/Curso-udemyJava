import java.util.Locale;

public class primeiroProjeto {

    public static void main(String[] args) {

        int v = 1981;
        double V = 1.981;
        String nome = "Vagner";
        int idade = 42;
        double renda = 15000.0;

        System.out.println(v);
        System.out.println(V);
        System.out.printf("%.2f%n", V);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", V);
        System.out.println("Resultado = " + V + " metros");
        System.out.printf("Resultado = %.2f metros%n", V);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais por mês.%n", nome, idade, renda);
        System.out.print("Olá mundo!");
        System.out.println("Bom dia!");
        System.out.print("Bom dia!");

    }
}