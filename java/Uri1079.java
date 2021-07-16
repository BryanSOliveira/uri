import java.util.Scanner;

public class Uri1079 {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        int N = in.nextInt();
        double n1, n2, n3, media;

        for (int i = 1; i <= N; i++) {
            n1 = in.nextDouble();
            n2 = in.nextDouble();
            n3 = in.nextDouble();
            media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
            System.out.printf("%.1f\n", media);
        }
        in.close();
    }
}
