import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        float preco=0;
        int cod=0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o preço do produto: ");
        preco=Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o código do produto: ");
        cod=Integer.parseInt(leitor.nextLine());
        System.out.println("Valor: "+preco);

        switch (cod) {
            case 1:
                 System.out.println("Procedência do SUL.");
                break;
                case 2:
                     System.out.println("Procedência do NORTE.");
                break;
                case 3:
                     System.out.println("Procedência do LESTE.");
                break;
                case 4:
                     System.out.println("Procedência do OESTE.");
                break;
                case 5: case 6:
                     System.out.println("Procedência do NOROESTE.");
                break;
                case 7: case 8: case 9: 
                     System.out.println("Procedência do SUDESTE.");
                break;
                case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20:
                     System.out.println("Procedência do CENTRO-OESTE.");
                break;
                case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29: case 30:
                     System.out.println("Procedência do NORDESTE.");
                
                default:
                     System.out.println("Código inválido.");
                break;
        }  
        leitor.close();
    }
}
