import java.util.Scanner;

public class Exercicio53 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tempo = 0;
        String nome;
        float salbase = 0, imposto = 0, gratificacao = 0, aa = 0, saliq = 0;

        System.out.println("Nome do funcionário: ");
        nome = (leitor.nextLine());
        System.out.println("Tempo de serviço (em anos): ");
        tempo = Integer.parseInt(leitor.nextLine());
        System.out.println("Salário-base: ");
        salbase = Float.parseFloat(leitor.nextLine());

        if (salbase > 200 && salbase <= 450) {
            imposto = salbase * 3 / 100;
        } else if (salbase > 450 && salbase < 700) {
            imposto = salbase * 8 / 100;
        } else if (salbase == 700) {
            imposto = salbase * 10 / 100;
        } else {
            imposto = salbase * 12 / 100;
        }
        if (salbase > 500 && tempo <= 3) {
            gratificacao = salbase * 2 / 100 + 50;
        } else {
            gratificacao = salbase * 3 / 100 + 60;
        }
        if (salbase <= 500 && tempo <= 3) {
            gratificacao = salbase * 5 / 100 + 23;
        } else {
            gratificacao = salbase * 6 / 100 + 35;
        }
        if (tempo <= 10) {
            aa = salbase * 4 / 100;
        } else {
            aa = salbase * 6 / 100;
        }
        saliq = salbase + gratificacao + aa - imposto;
        System.out.println("Salário liquido: " + saliq);
        leitor.close();

    }
}
