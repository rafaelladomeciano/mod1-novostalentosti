import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int colmau = 0;
        System.out.println("Digite quantos miligramas de colesterol mau existe no seu sangue: ");
        colmau = Integer.parseInt(leitor.nextLine());

        if (colmau == 130) {
            System.out.println("Situação: IDEAL");
        } else if (colmau > 130) {
            System.out.println("Situação: MAIOR QUE O IDEAL");
        } else {
            System.out.println("Situação: MENOR QUE O IDEAL");
        }
        leitor.close();
    }

}
