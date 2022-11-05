public class Chaveador {
    public static void main(String[] args) {
        int opcao=10;

        if(opcao==0){
            System.out.println("IF:Valor ZERO");
        }else{
            if(opcao==1){
                System.out.println("IF:Valor não é zero");
            } else{
                if(opcao==-1){
                    System.out.println("IF:Valor negativo");
                }
            }    
        }
        switch (opcao) {
            case -1:
                 System.out.println("SWITCH: valor negativo");
             break;

             case 0:
                  System.out.println("SWITCH: valor zero");
             break;

             case 1:
             System.out.println("SWITCH: valor 1");

             default:
                  System.out.println("Nenhum dos casos anteriores");          
                break;
        }
    }
}
