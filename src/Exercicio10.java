import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float salario=0, vendas=0;

        System.out.println("Salário fixo: ");
        salario= Float.parseFloat(leitor.nextLine());
        System.out.println("Valor das vendas: ");
        vendas = Float.parseFloat(leitor.nextLine());

        salario=salario+(vendas*4)/100;

        System.out.println("Salário + comissão é igual a: " + salario);
                
        leitor.close();
        
    }
}
