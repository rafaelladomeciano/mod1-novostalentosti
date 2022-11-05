import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float salmin = 0, valhora = 0, salbruto = 0, valimposto = 0, salreceber = 0;
        int horas = 0;
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horas = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o valor do salário mínimo: ");
        salmin = Float.parseFloat(leitor.nextLine());

        valhora = salmin / 2;
        salbruto = horas * valhora;
        valimposto = salbruto * 3 / 100;
        salreceber = salbruto - valimposto;

        System.out.println("O salário a receber é: " + salreceber);

        leitor.close();
    }
}
