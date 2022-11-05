
import java.util.Scanner;

public class Exercicio72 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] listaNum = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            listaNum[i] = Integer.parseInt(leitor.nextLine());
        }
        // System.out.println(Arrays.toString(listaNum));

        for (int i = 0; i < 10; i++) {
            if (listaNum[i] > 10) { // FILTRO
                System.out.println(listaNum[i]);
            }
        }
        leitor.close();
    }
}
