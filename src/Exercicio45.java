import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        float valor = 0;
        System.out.println("Digite o valor de suas compras:");
        valor = Integer.parseInt(leitor.nextLine());

        if (valor <= 100) {
            valor = valor * 95 / 100;
            System.out.println("Valor final: " + valor);
        } else {
            if (valor > 100 && valor < 400) {
                valor = valor * 90 / 100;
                System.out.println("Valor final: " + valor);
            } else {
                if (valor > 400) {
                    valor = valor * 87 / 100;
                    System.out.println("Valor final: " + valor);
                }
            }
            leitor.close();
        }
    }
}
