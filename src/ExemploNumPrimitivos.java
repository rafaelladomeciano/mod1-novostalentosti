public class ExemploNumPrimitivos {
    public static void main(String[] args) throws Exception {
    //int significa TIPO DE INFORMACAO INTEIRO
    //ATRIBUICAO DE VALOR - variavel = valor

    //ENTRADA
    int primeironumero = 7;
    int segundonumero = 2;

    //PROCESSAMENTO
   int resultado =  primeironumero + segundonumero;

   //SAIDA
   System.out.print("O resultado é: "); 
   System.out.println(resultado);

   //CONCATENACAO
   System.out.println("o resultado é: " + resultado);

   //INTERPOLACAO DE STRING
   System.out.println(String.format("O resultado e: %d" , resultado));

   //SUBTRACAO
   int umnumero = 2;
   int doisnumero = 2;

   int subtracao = umnumero - doisnumero;

   System.out.println(String.format("O resultado e: %d" , subtracao));

   //MULTIPLICACAO
   int numeroum = 2;
   int numerodois = 2;

   int multiplicacao = numeroum * numerodois;

   System.out.println("O resultado e: " + multiplicacao);

   //DIVISAO
   int numeroumm = 7;
   int numerodoiis = 2;

   float divisao =(float) numeroumm / (float)numerodoiis;

   System.out.println("O resultado e: " + divisao);

   //tipo logico (booleano) = true ou false
   boolean resultadocomparacao = primeironumero == segundonumero;
   System.out.println(resultadocomparacao);
   System.out.println(resultadocomparacao?"Verdadeiro":"Falso");

   String nome = "Walter Silvestre Coan";

   System.out.println(nome.replace("a", "$"));
   char umaLetra = 'a';
   System.out.println(umaLetra);
   System.out.println((int)umaLetra);

   long numeromuitogrande = 10;
   //ERRO: variavel INT nao suporta valor LONG por conta do tamanho.
   //int numeromuitogrande = 10l;
   System.out.println(numeromuitogrande);
   
   int salario = (int)1210.5;
   System.out.println(salario);

   // ERRO: o double tem 64bits e nao cabe no float 32bits
   //float imposto = 1000.0;

     }
}

