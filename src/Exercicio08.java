import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float nreal=0,numdecimal=0;
        int numinteiro=0, numarredondado=0;   
    
        System.out.println("Digite um número real: ");
        nreal= Float.parseFloat(leitor.nextLine());

        numinteiro=(int)nreal;
        System.out.println("O valor inteiro é: "+numinteiro);
    
        numdecimal=nreal-(int)nreal;
        System.out.println("Parte fracionária: " +numdecimal);

        numarredondado=Math.round(nreal);
        System.out.println("Número arredondado: " +numarredondado); 
        
        leitor.close();

    }
    
}
