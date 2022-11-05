import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        float salario = 0, qntdqlwt = 0, valqlwt = 0, valpago = 0, valdscnt = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Valor do salário mínimo: ");
        salario = Float.parseFloat(leitor.nextLine());
        System.out.println("Quilowatts consumidos na residência: ");
        qntdqlwt = Float.parseFloat(leitor.nextLine());

        valqlwt = salario / 5f;
        valpago = valqlwt * qntdqlwt;
        valdscnt = valpago * 85f / 100f;

        System.out.println("O valor unitário do quilowatt é " + valqlwt);
        System.out.println("Valor a ser pago por essa residência: " + valpago);
        System.out.println("Valor a ser pago com 15% de desconto: " + valdscnt);

        leitor.close();
    }
}
