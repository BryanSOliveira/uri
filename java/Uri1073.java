import java.util.Scanner;

public class Uri1073 {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        int input = in.nextInt();
        in.close();

        for (int i = 1; i <= input; i++) {
            if (i % 2 == 0) {
                int quadrado = i * i;
                System.out.println(i + "^2 = " + quadrado);
            }
        }
    }
}
