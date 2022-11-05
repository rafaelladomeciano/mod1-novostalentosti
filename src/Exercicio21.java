import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float percaumento=0;
        float salario=0;
        float resultado=0;
        float aumento=0;

        System.out.println("Digite o salário inicial: ");
        salario= Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a porcentagem do aumento: ");
        percaumento= Float.parseFloat(leitor.nextLine());

        aumento=salario*percaumento/100;
        resultado=salario+aumento;

        System.out.println("Valor do aumento " +aumento);
        System.out.println("Novo salário: " + resultado);
        
        leitor.close();
        



    }
}
