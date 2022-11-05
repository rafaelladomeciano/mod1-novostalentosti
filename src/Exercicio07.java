import java.util.Scanner;

public class Exercicio07 {
 public static void main(String[] args) {

    float valboleto=0, valmulta=0, percmulta=0;
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite o valor do boleto: ");
    valboleto=Float.parseFloat(leitor.nextLine());
    System.out.println("Digite o percentual da multa: ");
    percmulta=Float.parseFloat(leitor.nextLine());

    valmulta=(valboleto*percmulta)*100f;

    System.out.println("O valor da multa é: " + valmulta);
    
    leitor.close();




 }
}
