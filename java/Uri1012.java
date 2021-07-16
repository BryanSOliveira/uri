import java.util.Scanner;

public class Uri1012 {
    public static void main(String[] args) {
        
        // ENTRADA
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();
        
        in.close();

        // PROCESSAMENTO
        System.out.printf("TRIANGULO: %.3f\n", (A*C)/2);
        System.out.printf("CIRCULO: %.3f\n", (3.14159*(C*C)));
        System.out.printf("TRAPEZIO: %.3f\n", (((A+B)/2)*C));
        System.out.printf("QUADRADO: %.3f\n", (B*B));
        System.out.printf("RETANGULO: %.3f\n", (A*B));


        // SAÍDA
        
    }
}
