import java.util.Scanner;

public class Exercicio64 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num1=0, num2=0;
        int acumulador = 0;
        System.out.println("Digite o primeiro numero");
        num1 = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o segundo numero");
        num2 = Integer.parseInt(leitor.nextLine());

        for(int i=0; i<num1 ; i++){
            acumulador = acumulador + num2;
        }
        System.out.println(String.format("%d x %d = %d",num1,num2,acumulador));
        leitor.close();
    }
}