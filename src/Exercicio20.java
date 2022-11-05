import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double horario, totalmin=0,min=0, totalseg=0;

        System.out.println("Digite um horário: ");
        horario=Integer.parseInt(leitor.nextLine());
        System.out.println("Digite os minutos: ");
        min= Integer.parseInt(leitor.nextLine());

        horario=horario*60;
        totalmin=horario+min;
        totalseg=totalmin*60;

        System.out.println("Hora convertida em minutos: " +horario);

        System.out.println("Total de minutos: " +totalmin);
        System.out.println("Minutos em segundos: " +totalseg);

       leitor.close();

    }
}
