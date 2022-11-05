import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float salarioinicial = 0, salariofinal = 0;

        System.out.println("Digite seu saláro atual: ");
        salarioinicial = Float.parseFloat(leitor.nextLine());

        salariofinal = salarioinicial * 30 / 100;
        salariofinal = salarioinicial + salariofinal;

        if (salarioinicial <= 500) {
            System.out.println("O salário reajustado é de: " + salariofinal);
        } else {
            System.out.println("Você não tem direito ao aumento.");
        }

        leitor.close();
    }
}
