import java.util.Scanner;

public class ExemploBlocoRepeticao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contador = 0;

        while (contador <= 10) {
            System.out.println("rodando..." + contador);
            // operador de incremento feito
            // contador =contador +1
            // contador +=1
            // contador =contador+2
            // contador +=2
            // pode nunca rodar
            contador++;
        }
        contador = 10;
        // VOCE NUNCA SABE QUANTO ELE VAI REPETIR
        while (contador >= 0) {
            System.out.println("rodando..." + contador);
            contador--;
        }
        // validação
        int resposta = 5;
    
        System.out.println("sim eu vou entrar pelo menos uma vez");
        System.out.println("Digite o número 5");
        resposta = Integer.parseInt(leitor.nextLine());
        if (resposta != 5) {
            // continue; -pula a repetição atual do bloco e continua
            System.out.println("Valor inválido");
            // break; -quebra o bloco de repetição mais próximo
        }
        while (resposta != 5) ;

        // for(inicializar; condição de repetição; aumentar/descrever){corpo}
        // primeira vez            1                      2
        // nas outras vezes        2                      1
        // SEMPRE SABE QUANTAS VEZES VAI REPETIR
        for (int i = 0; i < 5; i++)

        {
            System.out.println("FOR" + i);
            leitor.close();

        }
    }
}

