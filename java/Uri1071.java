import java.util.Scanner;

public class Uri1071 {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int aux = 0;
        int soma = 0;
        in.close();
        if (x > y) {
            aux = x;
            x = y;
            y = aux;
        } 
        for(int i = x +1; i < y; i++) {
            if (i % 2 != 0) {
                soma = soma + i;
            }
        }
        System.out.println(soma);
    }
}
