import java.util.Scanner;

public class Uri1099 {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        int casos = in.nextInt();
        int x, y, aux, cont = 0;

        do {
            int soma = 0;
            x = in.nextInt();
            y = in.nextInt();
            if (x > y) {
                aux = x;
                x = y;
                y = aux;
            }
            for (int i = x + 1; i < y; i++) {
                if (i % 2 != 0) {
                    soma = soma + i;
                }
            }
            System.out.println(soma);
            cont++;
        } while (cont != casos);
        in.close();
    }
}
