import java.util.Scanner;

public class Exercicio60 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num = 0, soma = 0;
        float media = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número");
            num = Integer.parseInt(leitor.nextLine());
            soma += num;
        }
        media = soma + 10f;
        System.out.println("Média: " + media);
        System.out.println("Soma: " + soma);
        leitor.close();
    }

}
