import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double total = 0, ir = 0;

        System.out.println("Digite seu rendimento anual:");
        total = Double.parseDouble(leitor.nextLine());

        if (total >= 19.200 && total < 30.000) {
            ir = total * 8 / 100;
            System.out.printf("Valor a pagar pelo imposto de renda: %.3f",ir);
        } else {
            if (total > 30.000) {
                ir = total * 11 / 100;
                System.out.printf("Valor a pagar pelo imposto de renda: %.3f",ir);
            } else {
                System.out.println("ISENTO");
            }
        }
        leitor.close();
    }
}
