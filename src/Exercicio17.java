import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
         float salario=0, fat1=0, fat2=0;

         System.out.println("Digite o salário: ");
         salario= Float.parseFloat(leitor.nextLine());

         System.out.println("Valor da primeira fatura: ");
         fat1= Float.parseFloat(leitor.nextLine());
        
         System.out.println("Valor da segunda fatura: ");
         fat2= Float.parseFloat(leitor.nextLine());

         fat1=(fat1*4)/100;
         fat2=(fat2*4)/100;

         salario= salario-fat1-fat2;

         System.out.println("O que restou do salário foi: " +salario);



        leitor.close();
        
    }
}
