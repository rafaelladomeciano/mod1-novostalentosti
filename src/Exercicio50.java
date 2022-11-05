import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int votoa = 0, votob = 0, votoc = 0, ba = 0, bb = 0, bc = 0, na = 0, nb = 0, nc = 0;

        System.out.println("Total de votos do candidato A: ");
        votoa = Integer.parseInt(leitor.nextLine());
        System.out.println("Votos nulos: ");
        na = Integer.parseInt(leitor.nextLine());
        System.out.println("Votos em branco: ");
        ba = Integer.parseInt(leitor.nextLine());
        System.out.println("Total de votos do candidato B: ");
        votob = Integer.parseInt(leitor.nextLine());
        System.out.println("Votos nulos: ");
        nb = Integer.parseInt(leitor.nextLine());
        System.out.println("Votos em branco: ");
        bb = Integer.parseInt(leitor.nextLine());
        System.out.println("Total de votos do candidato C: ");
        votoc = Integer.parseInt(leitor.nextLine());
        System.out.println("Votos nulos: ");
        nc = Integer.parseInt(leitor.nextLine());
        System.out.println("Votos em branco: ");
        bc = Integer.parseInt(leitor.nextLine());

        ba = 100 * ba / votoa;
        bb = 100 * bb / votob;
        bc = 100 * bc / votoc;

        na = 100 * na / votoa;
        nb = 100 * nb / votob;
        nc = 100 * nc / votoc;

        votoa = 100 - ba - na;
        votob = 100 - nb - bb;
        votoc = 100 - bc - nc;

        System.out.println("Percentual de votos do candidato A: " + votoa);
        System.out.println("Percentual votos nulos:" + na);
        System.out.println("Percentual votos em branco: " + ba);
        System.out.println("Percentual de votos do candidato B: " + votob);
        System.out.println("Percentual votos nulos: " + nb);
        System.out.println("Percentual votos em branco: " + bb);
        System.out.println("Percentual de votos do candidato C: " + votoc);
        System.out.println("Percentual votos nulos: " + nc);
        System.out.println("Percentual votos em branco: " + bc);

        leitor.close();
    }
}
