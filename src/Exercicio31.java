import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {

        float num1 = 0, num2 = 0, resultado = 0;
        int cod = 0, num3 = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite 1 para somar números ou 2 para ter a raiz quadrada. ");
        cod = Integer.parseInt(leitor.nextLine());

        if (cod == 1) {
            System.out.println("Digite o primeiro numero");
            num1 = Float.parseFloat(leitor.nextLine());
            System.out.println("Digite o segundo numero");
            num2 = Float.parseFloat(leitor.nextLine());
            resultado = num1 + num2;
            System.out.println("A soma e " + resultado);
        } else {
            System.out.println("Digite um numero");
            num3 = Integer.parseInt(leitor.nextLine());
            resultado = (float) Math.sqrt(num3);
            System.out.println("O resultado e " + resultado);
        }
        leitor.close();
    }
}
