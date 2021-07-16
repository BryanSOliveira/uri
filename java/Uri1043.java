import java.util.Scanner;

public class Uri1043 {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();
        in.close();

        if (A + B > C) {
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f", perimetro);
        } else {
            double area = ((A + B) / C) / 2;
            System.out.printf("Area = %.1f", area);
        }
    }
}
