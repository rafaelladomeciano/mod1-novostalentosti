import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
      
        double qntdl=0, kmrod=0, reembolso=0;


        System.out.println("Kms rodados: ");
        Scanner leitor = new Scanner(System.in);
        kmrod = Double.parseDouble(leitor.nextLine());

        qntdl= kmrod/13;
        reembolso=qntdl*2.20;

        System.out.println("Reembolso: " + reembolso);

        leitor.close();
    }
}
