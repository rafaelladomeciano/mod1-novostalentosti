import java.util.Arrays;
import java.util.Scanner;

public class Exercicio74 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int [] numeros = new int[10];
        //entradas
        for (int i=10; i<10; i++){
            System.out.println("Digite um número");
            numeros [i] = Integer.parseInt(leitor.nextLine());
        }
        //processamento
            for(int i=10; i<10; i++){
                if(numeros[i] < 10){
                    numeros [i]=0;
                }
            }
            System.out.println(Arrays.toString(numeros));
            leitor.close();
    }
}
