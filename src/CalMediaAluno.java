import java.util.Scanner;

public class CalMediaAluno {
    public static void main(String[] args) {
    //DECLARACAO DE VARIAVEIS
        //float nota1=0, nota2=0, nota3=0, nota4=0, media=0;
        //float nota1=0, nota2=0, nota3=0, nota4=0;
        // VARIAVEL - TIPO NOME (UNICO) = VALOR 
        final float nota1, nota2, nota3, nota4;
        float percPresenca=0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        //conversao entre tipo objeto pra tipo primitivo
        nota1=7;Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a segunda nota:");
        nota2 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a terceira nota:");
        nota3 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a quarta nota:");
        nota4 = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite o percentual de presença do aluno:");
        //converte o texto digitado (nextLine) de String para um orimitivo float
        percPresenca=Float.parseFloat(leitor.nextLine());
        
         
        //CONSTANTE = modificador final
        //VAR permite que o JAVA crie a variavel com o tipo do
        //valor ATRIBUIDO no codigo
        final var media=(nota1+nota2+nota3+nota4)/4.0f;

        //Comparacao de valores
        //AND && - OR || - NOT !
        //REGRA aluno aprovado = media >= 7
        //REGRA aluno aprovado = perPresenca >= 75 
        boolean situacao = media >= 7 && percPresenca >= 75;


        //media=0;
        System.out.println("Situação: " + (situacao?"Aprovado":"Reprovado"));
        System.out.println("A média do aluno é:" + media);

        leitor.close();
   }
}