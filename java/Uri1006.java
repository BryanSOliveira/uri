import java.util.Scanner;
public class Uri1006 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();

        in.close();
        
        double media = (((A * 2.0) + (B * 3.0) + (C * 5.0)) / 10);

        System.out.printf("MEDIA = %.1f%n", media);
    }
}
