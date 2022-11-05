import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        float salariobase = 0, salariofinal = 0, imposto = 0, gratificacao = 0;

        System.out.println("Digite seu salário base: ");
        Scanner leitor = new Scanner(System.in);
        salariobase = Float.parseFloat(leitor.nextLine());

        imposto = salariobase * 7 / 100;
        gratificacao = salariobase * 5 / 100;

        salariofinal = salariobase - imposto + gratificacao;

        System.out.println("O valor do seu salário final é: " + salariofinal);

        leitor.close();
    }
}
