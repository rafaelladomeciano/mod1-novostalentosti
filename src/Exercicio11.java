import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);        

        float peso=0, resultado15=0, resultado20=0, final20=0, final15=0;
        
        System.out.println("Digite o peso inicial: ");
        peso=Float.parseFloat(leitor.nextLine());

        resultado15= (peso*15) / 100;
        resultado20= (peso*20) / 100;

        final15=(resultado15+peso);
        final20=(peso-resultado20);

        System.out.println("Se a pessoa engordar 15% do seu peso, o valor final seria: " + final15);
        System.out.println("Se a pessoa emagrecer 20% do seu peso, o valor final seria: " + final20);


        leitor.close();



        



        
    }
}
