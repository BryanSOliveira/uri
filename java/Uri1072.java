import java.util.Scanner;

public class Uri1072 {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        int qtd = in.nextInt();
        int en = 0;
        int out = 0;
    
        for (int i = 1; i <= qtd; i++) {
            int entrada = in.nextInt();
            if (entrada >= 10 & entrada <= 20) {
                en++;
            } else {
                out++;
            }
        }
        in.close();
        System.out.println(en + " in");
        System.out.println(out + " out");
    }
}