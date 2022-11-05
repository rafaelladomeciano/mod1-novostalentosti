import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float diagmenor=0, diagmaior=0, area=0;

        System.out.println("Digite a diagonal maior de um losango: ");
        diagmaior=Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a diagonal menor: ");
        diagmenor=Float.parseFloat(leitor.nextLine());

        area=(diagmaior*diagmenor)/2;

        System.out.println("A área de um losango é: " + area);
        
        leitor.close();
        
    }
}
