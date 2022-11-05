import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade = 0;

        System.out.println("Digite a idade: ");
        idade = Integer.parseInt(leitor.nextLine());

        if (idade >= 18) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa é menor de idade.");
            leitor.close();
        }
    }
}
