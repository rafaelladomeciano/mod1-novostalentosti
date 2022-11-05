import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        double dinheiro=0, dolar=0, libra=0, alemao=0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantidade de dinheiro para a viagem: ");
        dinheiro=Float.parseFloat(leitor.nextLine());

        dolar=dinheiro/1.8;
        libra=dinheiro/1.57;
        alemao=dinheiro/2;

        System.out.println("Em DÓLAR: " +dolar);
        System.out.println("Em LIBRA ESTERLINA: " + libra);
        System.out.println("Em MARCO ALEMÃO: " + alemao);

        leitor.close();
    }
}
