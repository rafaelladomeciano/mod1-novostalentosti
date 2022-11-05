import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double aluguel = 0, cond = 0, agua = 0, gas = 0, dsct = 0, total = 0;
        int mc = 0;

        System.out.println("Aluguel:");
        aluguel = Double.parseDouble(leitor.nextLine());
        System.out.println("Condomínio:");
        cond = Double.parseDouble(leitor.nextLine());
        System.out.println("Metros cúbicos: ");
        mc = Integer.parseInt(leitor.nextLine());

        gas = mc * 1.8;
        agua = mc * 0.6;

        dsct = aluguel * 5 / 100;

        total = aluguel + cond + agua + gas;

        System.out.printf("Taxa de água: %.2f\n", agua);
        System.out.printf("Taxa de do gás: %.2f\n", gas);
        System.out.printf("Total: %.2f\n", total);
        System.out.printf("Desconto do alugel se pago 5 dias antes do vencimento: %.2f\nn", dsct);

        leitor.close();
    }
}
