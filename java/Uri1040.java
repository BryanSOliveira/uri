import java.util.Scanner;

public class Uri1040 {
    public static void main(String[] args) {
        
        // ENTRADA
        Scanner in = new Scanner(System.in);
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();
        double n3 = in.nextDouble();
        double n4 = in.nextDouble();

        // PROCESSAMENTO
        double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) /10;
        if (media >= 7.0) {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado.");
        } else if (media >= 5.0 & media <= 6.9) {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno em exame.");
            double ne = in.nextDouble();
            in.close();
            System.out.printf("Nota do exame: %.1f\n", ne);
            media = (media + ne)/2;
            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", media);
            } else if (media <= 4.9) {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", media);
            }
        }
        // SAÍDA
        
    }
}
