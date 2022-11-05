import java.util.Scanner;

public class Exercicio09{
public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in); 
    float valprdt=0, resultado=0, valfinal=0;

    System.out.println("Digite o valor do produto sem desconto: ");
    valprdt=Float.parseFloat(leitor.nextLine());
    resultado=(valprdt*10)/100;
    valfinal=valprdt-resultado;
    System.out.println("O valor do produtor com 10% de desconto é de: " +valfinal);




    leitor.close();


}



}
