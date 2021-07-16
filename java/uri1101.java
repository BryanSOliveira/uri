import java.util.Scanner;

public class uri1101 {
    public static void main (String [] args) {
    Scanner in = new Scanner (System.in);
    int n, m, aux;
    do {
        int soma = 0;
        n = in.nextInt();
        m = in.nextInt();
        if (n > 0 & m > 0) {
        if (n > m) {
            aux = n;
            n = m;
            m = aux;
        }
        for (int i = n; i <= m; i++) {
            System.out.print(i + " ");
            soma = soma + i;
            if (i == m) {
                System.out.println("Sum=" + soma);
            }
        }
        }
    
    } while (n > 0 & m > 0);
    in.close();
    }
}
