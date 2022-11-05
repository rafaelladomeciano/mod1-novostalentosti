import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float salario=0, resul=0, salfinal=0;
      
        System.out.println("Digite o salário inicial: ");
        salario=Float.parseFloat(leitor.nextLine());

        resul= salario+50;
        salfinal=salario*10/100;
        salfinal=resul-salfinal;

        System.out.println("Salário final :" + salfinal);

        leitor.close();
    }
}
