import java.util.Arrays;

public class ExemploString {
    public static void main(String[] args) {
        String texto="Universidade da Região de Joinville";
        char []textoarray=texto.toCharArray();
        System.out.println(Arrays.toString(textoarray));
        //retorna um caracter na posicao infromada
        System.out.println(texto.charAt(0));
        //troca um ou mais caracteres por outros
        //STRINGS SAO IMUTAVEIS
        // ERRADO System.out.println(texto.replace(" ", ","));
        texto=texto.replace( " ",",");
        System.out.println(texto);
        //corta o texto
        System.out.println(texto.substring(26, 35));
        //qnts caracteres tem no texto
        System.out.println(texto.length());
        System.out.println(Arrays.toString(texto.split(",")));

        
    }

    
}
