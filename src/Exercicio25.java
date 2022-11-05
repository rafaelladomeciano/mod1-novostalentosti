import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double salario=0, cheque1=0, cheque2=0,cmpf=0, saldoatual=0;

        System.out.println("Digite seu salário inicial: ");
        salario=Double.parseDouble(leitor.nextLine());
        System.out.println("Valor do primeiro cheque: ");
        cheque1=Double.parseDouble(leitor.nextLine());
        System.out.println("Valor do segundo cheque: ");
        cheque2=Double.parseDouble(leitor.nextLine());

        cmpf=(cheque1*0.38)/100;
        cmpf=(cheque2*0.38)/100;
        saldoatual=salario-(cheque1+cmpf+cheque2+cmpf);

        System.out.println("Saldo atual: " +saldoatual);
        leitor.close();
    }
}
