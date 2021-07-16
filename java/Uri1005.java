import java.util.Scanner;
public class Uri1005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();

        in.close();
        
        double media = (((A * 3.5) + (B * 7.5)) / 11);

        System.out.printf("MEDIA = %.5f%n", media);
    }
}
