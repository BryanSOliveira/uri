import java.util.Scanner;

public class Uri1036 {
    public static void main(String[] args) {
        
        // ENTRADA
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();
        double delta = (B * B) - 4 * A * C;
        double raizdelta = Math.sqrt(delta);
        double R1 = (-B + raizdelta) / (2 * A);
        double R2 = (-B - raizdelta) / (2 * A);
        
        in.close();

        // PROCESSAMENTO
        if (A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }

        // SAÍDA
        
    }
}
