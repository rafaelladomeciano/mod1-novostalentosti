import java.util.Scanner;

public class ExemploDecisao {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        int numero=0;

        System.out.println("Digite um número: ");
        numero=Integer.parseInt(leitor.nextLine());

        /*
        if(condicao/teste){
        //bloco de codigo (NETAO - VERDADEIRO)
        }else{}
        //bloco de codigo (SENAO - FALSO)
        }

        IF(condicao/teste{
        //bloco de codigo (ENTAO - VERDADEIRO)
        }
        */
        if(numero>=10){
        System.out.println("O número é maior que DEZ");
        }else{
        System.out.println("O número é menor que DEZ");

        leitor.close();
        }
        }}