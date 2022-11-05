import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        double numfotos=0, valorunit=0.90,valortotal=0;

        System.out.println("Quantidade de fotos: ");
        Scanner leitor = new Scanner(System.in);
        numfotos= Double.parseDouble(leitor.nextLine());

        valortotal = (numfotos * valorunit);

        System.out.println("Valor total: " + valortotal);

        leitor.close();
    }
}
