import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dias = 0, pag = 0, resul = 0;

        System.out.println("Digite a quantidade de páginas: ");
        pag = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite a quantidade de dias: ");
        dias = Integer.parseInt(leitor.nextLine());

        resul = pag / dias;

        if (resul >= 100) {
            System.out.println("É impossível realizar a leitura nesse tempo.");
        } else {
            System.out.println("Páginas por dia: " + resul);
        }
        leitor.close();
    }

}
