import java.util.Scanner;

public class Uri1013 {
    public static void main(String[] args) {

        // Entrada de Dados
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        in.close();

        // Processamento com Saída de Dados
        int AB = ((A + B) + Math.abs(A - B)) / 2;
        if (AB > C) {
            System.out.println(AB + " eh o maior");
        } else {
            System.out.println(C + " eh o maior");
        }

    }
}
