
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio73 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] num = new int[10];
        int contapar = 0, contaimpar = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o numero: ");
            num[i] = Integer.parseInt(leitor.nextLine());
        }
        System.out.println(Arrays.toString(num));
        for (int i = 0; i < 10; i++) {
            if (num[i] % 2 == 0) {
                contapar++;
            } else {
                contaimpar++;
            }
        }
        System.out.println("Impar: " + contaimpar);
        System.out.println("Par: " + contapar);

        leitor.close();
    }
}
