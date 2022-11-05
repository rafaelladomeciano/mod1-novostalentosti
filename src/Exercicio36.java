import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        float pesoKG = 0;
        float pesoGramas = 0;
        float consumoGato1 = 0, consumoGato2 = 0;
        float sobraRacao = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o peso da ração em KG:");
        pesoKG = Float.parseFloat(leitor.nextLine());

        pesoGramas = pesoKG * 1000f;

        System.out.println("Digite o valor consumido pelo gato 1");
        consumoGato1 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor consumido pelo gato 2");
        consumoGato2 = Float.parseFloat(leitor.nextLine());

        sobraRacao = pesoGramas - ((consumoGato1 + consumoGato2) * 5f);

        System.out.println("O valor de sobra e " + sobraRacao);

        leitor.close();
    }
}