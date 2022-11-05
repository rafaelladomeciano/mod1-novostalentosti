import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        
        int salario=0, despesa=0, porcentagem=0;

        System.out.println("Valor do salário: ");
        Scanner leitor = new Scanner(System.in);
        salario= Integer.parseInt(leitor.nextLine());

        System.out.println("Valor da despesa: ");
        despesa= Integer.parseInt(leitor.nextLine());

        porcentagem = despesa*100/salario;

        System.out.println(String.format(
            "A despesa de R$%.2f representa %.2f%% do salário de R$%.2f", despesa, porcentagem, salario));
            
        leitor.close();
    }
}
