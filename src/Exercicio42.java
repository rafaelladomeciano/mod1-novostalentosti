import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int vel = 0;
        System.out.println("Velocidade do carro: ");
        vel = Integer.parseInt(leitor.nextLine());

        if (vel >= 60 && vel <= 100) {
            System.out.println("Multa média 60 UFIR");
        } else {
            if (vel >= 100 && vel <= 160) {
                System.out.println("Multa grave 120 UFIR");
            } else {
                if (vel < 60) {
                    System.out.println("Velocidade inválida");
                } else {
                    System.out.println("Multa gravíssima 180 UFIR");
                }
            }
        }
        leitor.close();
    }
}
