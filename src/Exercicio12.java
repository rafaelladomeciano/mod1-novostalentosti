import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float pesokg=0, pesog=0;

        System.out.println("Digite o peso em quilos: ");
        pesokg= Float.parseFloat(leitor.nextLine());

        pesog= pesokg*1000;

        System.out.println("Esse valor em gramas é: " + pesog);


        leitor.close();

    }
}
