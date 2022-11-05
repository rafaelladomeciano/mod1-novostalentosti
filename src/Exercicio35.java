import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double precofabrica = 0, precofinal = 0;
        int lucro = 0, imposto = 0;

        System.out.println("Preço de fábrica de um veículo: ");
        precofabrica = Double.parseDouble(leitor.nextLine());
        System.out.println("Percentual de lucro: ");
        lucro = Integer.parseInt(leitor.nextLine());
        System.out.println("Percentual de impostos: ");
        imposto = Integer.parseInt(leitor.nextLine());

        precofinal = precofabrica * lucro / 100 + precofabrica;
        precofinal = precofabrica * imposto / 100 + precofabrica;

        System.out.printf("Preço final do veículo: %.3f %n", precofinal);

        leitor.close();
    }
}
