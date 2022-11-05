import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int litros = 0;
        System.out.println("Digite quantos litros seu carro faz por km: ");
        litros = Integer.parseInt(leitor.nextLine());

        if (litros >= 10 && litros <= 16) {
            System.out.println("Consumo normal");
        } else {
            System.out.println("Consumo anormal");
        }
        leitor.close();
    }
}
