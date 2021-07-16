import java.util.Arrays;
import java.util.Scanner;

public class Uri1042 {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        int [] vetor = new int [3];
        for (int i = 0; i < 3; i++) {
            vetor[i] = in.nextInt();
        }
        in.close();

        int [] ordenado = new int [3];
        for (int i = 0; i < 3; i++) {
            ordenado [i] = vetor[i];
        }

        Arrays.sort(ordenado);

        for (int i = 0; i < 3; i++) {
            System.out.println(ordenado[i]);
        }
        System.out.printf("\n");
        for (int i = 0; i < 3; i++) {
            System.out.println(vetor[i]);
        }
    }
}
