import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double celsius=0, resultadoc=0;

        System.out.println("Digite uma temperatura em Celsius: ");
        celsius=Float.parseFloat(leitor.nextLine());

        resultadoc= (celsius*1.8)+32;

        System.out.println("A temperatura em Fahrenheit é: " + resultadoc);

        leitor.close();
    }
}
