import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um número: ");
        numero = Integer.parseInt(leitor.nextLine());

        if (numero % 2 == 0) {
            System.out.println("O número é PAR.");
        } else {
            System.out.println("O número é ÍMPAR.");
        }
        leitor.close();
    }
}
