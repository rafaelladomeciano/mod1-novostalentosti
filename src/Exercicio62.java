import java.util.Scanner;

public class Exercicio62 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num=0, maior=0, menor=0, cont=0;

        do{
            System.out.println("Digite um número");
            num=Integer.parseInt(leitor.nextLine());
            if(num>=0){
                if(num>maior){
                    maior=num;
                }
                //estou na primeira volta? passando aq pela primeira vez
                if(cont==0){
                    //entao o num digitado eh o menor
                    menor=num;
                }else{
                    if(num<menor){
                        menor=num;
                    }
                }
            }
            cont++;
        }while(num>=0);
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
        leitor.close();
            
        }
    }
    

