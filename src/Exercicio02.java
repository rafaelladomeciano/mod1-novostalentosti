import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        int convd = 0, qntd = 250, gcarne=0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos convidados?");
        convd = Integer.parseInt(leitor.nextLine());

        gcarne = convd * qntd;

        System.out.println("Quantidade necessária de carne (em g): " + gcarne);

        leitor.close();

    }
}
