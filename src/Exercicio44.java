import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int min = 0;
        double lig = 0, valor = 0;

        System.out.println("Digites quantos minutos durou a ligação:");
        min = Integer.parseInt(leitor.nextLine());
        System.out.println(" 1 LOCAL, 2 INTERMUNICIPAL ou 3 INTERESTADUAL?");
        lig = Double.parseDouble(leitor.nextLine());

        if (lig == 1) {
            valor = 0.020 * min;
            System.out.printf("Valor da ligação: %.2f", valor);
        } else {
            if (lig == 2) {
                valor = 0.08 * min;
                System.out.printf("Valor da ligação: %.2f", valor);
            } else {
                if (lig == 3)
                    valor = 0.1 * min;
                System.out.printf("Valor da ligação: %.2f", valor);
            }
        }
        leitor.close();
    }
}
