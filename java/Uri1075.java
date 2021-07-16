import java.util.Scanner;

public class Uri1075 {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        int entrada = in.nextInt();
        in.close();

        for (int i = 2; i < 10000; i++) {
            if (i % entrada == 2) {
                System.out.println(i);
            }
        }
    }
}
