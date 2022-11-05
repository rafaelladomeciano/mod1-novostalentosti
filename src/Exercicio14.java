import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float lado=0, area=0;

        System.out.println("Lado: ");
        lado= Float.parseFloat(leitor.nextLine());

        area=(lado*4);

        System.out.println("A area de um quadrado é: " + area);

        leitor.close();
    }
}
