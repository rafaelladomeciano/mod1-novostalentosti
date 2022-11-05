import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        float media = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite dois números aleatórios: ");
        num1 = Integer.parseInt(leitor.nextLine());
        num2 = Integer.parseInt(leitor.nextLine());

        if (num1 == num2) {
            media = num1 + num2 / 2;
            System.out.println("A média desses dois números é: " + media);
        } else if (num1 < num2) {
            System.out.println("Número maior: " + num2);
            System.out.println("Número menor: " + num1);
        } else {
            System.out.println("Número maior: " + num1);
            System.out.println("Número menor: " + num2);
        }
        leitor.close();
    }
}
