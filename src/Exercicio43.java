import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int livro = 0;
        System.out.println("Quanto livros?");
        livro = Integer.parseInt(leitor.nextLine());

        if (livro<=32) {
            System.out.println("1 prateleira");
        } else {
            if (livro > 32 && livro <= 64) {
                System.out.println("2 prateleiras");
            } else {
                if (livro > 64 && livro <= 96) {
                    System.out.println("3 prateleiras");
                } else {
                    if (livro > 96 && livro <= 128) {
                        System.out.println("4 prateleiras");
                    } else {
                        if (livro > 138 && livro <= 160) {
                            System.out.println("5 prateleiras");
                        }
                    }
                }
            }
        }
        leitor.close();
    }
}
