import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float largura=0, comp=0, tamanho=0, potencia=0;

        System.out.println("Digite a largura do como em metros: ");
        largura=Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o comprimento do comodo em metros: ");
        comp=Float.parseFloat(leitor.nextLine());
        
        tamanho=largura*comp;
        potencia=tamanho/18;

        System.out.println("Tamanho do comodo: " +tamanho);
        System.out.println("Potencia: " +potencia);

        leitor.close();

    }

}
