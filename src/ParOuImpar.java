public class ParOuImpar {
    public static void main(String[] args) {
        int numero=11;
        int resultado=numero/2;
        int resto=numero%2;
        
        System.out.println(resultado);
        System.out.println("Resto: " + resto);
        //Operador Ternário <condição>?<verdadeiro>:<falso>
        System.out.println(resto==0?"PAR":"IMPAR");



   
    }
}
