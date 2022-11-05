import java.util.Scanner;

public class Exercicio61 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int num=0, soma=0, cont=0;
        float media=0;
    

        do{
            System.out.println("Digite um número: ");
            num=Integer.parseInt(leitor.nextLine());
            if(num<0){
                break;
            }
        }while(num>=0);
        media=soma/cont;
        System.out.println("Média: "+media);
        System.out.println("Soma: "+soma);
        leitor.close();
        }
    }

