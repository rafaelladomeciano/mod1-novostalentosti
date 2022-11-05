import java.util.Scanner;

public class DesafioDecisao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade=0;
        System.out.println("Digite sua idade: ");
        idade=Integer.parseInt(leitor.nextLine());
        if (idade <= 20){
            System.out.println("JOVEM");
        }else if (idade <=60){
            System.out.println("ADULTO");
        }else {
            System.out.println("IDOSO");
        }
          leitor.close();  }
             
         
    }




