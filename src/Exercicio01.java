import java.util.Scanner;

public class Exercicio01 {
public static void main(String[] args) {

   int hora=0;
   int dia=0;
   int total=0;

   Scanner leitor = new Scanner(System.in);

   System.out.println("Digite o número de horas trabalhadas no dia: ");
   hora=Integer.parseInt(leitor.nextLine());
   System.out.println("Digite quantos dias foram trabalhados no mês: ");
   dia=Integer.parseInt(leitor.nextLine());

   total=hora*dia;

   System.out.printf("Foram %.d horas trabalhadas no mês.", total);

   leitor.close();



}
}







