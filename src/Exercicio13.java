import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
       float  basemaior=0, basemenor=0, altura=0, area=0;
       Scanner leitor = new Scanner(System.in);
       
       System.out.println("Valor da base maior: ");
       basemaior= Float.parseFloat(leitor.nextLine());
       System.out.println("Valor da base menor: ");
       basemenor= Float.parseFloat(leitor.nextLine());
       System.out.println("Altura: ");
       altura= Float.parseFloat(leitor.nextLine());

       area=(basemaior+basemenor)*altura/2;
       System.out.println("A área do trapézio é: " + area);
       
       leitor.close();


    }



    
}
