import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {
        int n=0,outro=0;
        Scanner leitor= new Scanner(System.in);
        System.out.println("Digite o valor de N");
        n=Integer.parseInt(leitor.nextLine());

        for(int i=0;i<n;i++){
            System.out.println("Digite outro");
            outro=Integer.parseInt(leitor.nextLine());
            int resulfat=1;
            for(int j=outro;j>1;j--){
               // System.out.print(j);
               resulfat=resulfat*j;
            }
            System.out.println(String.format("%d!=%d",outro,resulfat));
            leitor.close();
        }
    }
}
