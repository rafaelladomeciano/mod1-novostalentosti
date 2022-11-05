import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float nota1 = 0, nota2 = 0, nota3 = 0, media = 0;

        System.out.println("Digite as 3 notas de um aluno para saber sua situação final: ");

        System.out.println("Nota 1: ");
        nota1 = Float.parseFloat(leitor.nextLine());
        System.out.println("Nota 2: ");
        nota2 = Float.parseFloat(leitor.nextLine());
        System.out.println("Nota 3: ");
        nota3 = Float.parseFloat(leitor.nextLine());

        media = (nota1 + nota2 + nota3) / 3;

        // OPERADOR E &&
        // OPERADOR OU ||
        // OPERADOR NÃO ! (!=/==)

        if (media >= 7 && media <= 10) {
            System.out.println("APROVADO média: " + media);
        } else {

            if (media >= 3 && media <= 7) {
                System.out.println("EXAME, média: " + media);
            } else {
                System.out.println("REPROVADO");
            }
        }
        leitor.close();
    }
}
