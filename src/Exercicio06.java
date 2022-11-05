import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        float qntd=0, numrefeicao=0, totalmes=0;


        System.out.println("Quantidade de ração por refeição (em g):  ");
        Scanner leitor = new Scanner(System.in);
        qntd=Float.parseFloat(leitor.nextLine());
        System.out.println("Quantas refeições ao dia? ");
        numrefeicao= Float.parseFloat(leitor.nextLine());

        totalmes= qntd*numrefeicao*30;

        System.out.println("Quantidade de ração necessária para um mês (em g): " + totalmes );
        
        leitor.close();





    }
}
