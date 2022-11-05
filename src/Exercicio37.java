import java.util.Scanner;

public class Exercicio37 {
     public static void main(String[] args) {
          float salatual = 0, salfinal = 0, aumento = 0;
          int cod = 0;
          Scanner leitor = new Scanner(System.in);
          System.out.println("Digite o código do cargo: ");
          cod = Integer.parseInt(leitor.nextLine());
          System.out.println("Digite seu salário atual: ");
          salatual = Float.parseFloat(leitor.nextLine());

          switch (cod) {
               case 1:
                    System.out.println("Função: Escrituário");
                    aumento = salatual * 50 / 100;
                    salfinal = salatual + aumento;
                    System.out.println("Aumento: " + aumento);
                    System.out.println("Novo salário: " + salfinal);
                    break;
               case 2:
                    System.out.println("Função: Secretário");
                    aumento = salatual * 35 / 100;
                    salfinal = salatual + aumento;
                    System.out.println("Aumento: " + aumento);
                    System.out.println("Novo salário: " + salfinal);
                    break;
               case 3:
                    System.out.println("Função: Caixa");
                    aumento = salatual * 20 / 100;
                    salfinal = salatual + aumento;
                    System.out.println("Aumento: " + aumento);
                    System.out.println("Novo salário: " + salfinal);
                    break;
               case 4:
                    System.out.println("Função: Gerente");
                    aumento = salatual * 10 / 100;
                    salfinal = salatual + aumento;
                    System.out.println("Aumento: " + aumento);
                    System.out.println("Novo salário: " + salfinal);
                    break;
               case 5:
                    System.out.println("Não tem direito a aumento. ");
               default:

                    break;
          }

          leitor.close();

     }
}
