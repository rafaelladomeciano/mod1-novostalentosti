import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        float salario=0, salariomin=0, qntd=0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Salário de um funcionário: ");
        salario=Float.parseFloat(leitor.nextLine());
        
        System.out.println("Valor do salário mínimo: ");
        salariomin=Float.parseFloat(leitor.nextLine());

        qntd= salario/salariomin;

        System.out.println("Esse funcionário ganha " +qntd );

         leitor.close();
    }
}
