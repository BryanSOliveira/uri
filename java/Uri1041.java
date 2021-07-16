import java.util.Scanner;

public class Uri1041 {
    public static void main(String[] args) {
        
        // ENTRADA
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        
        in.close();

        // PROCESSAMENTO
        if (x == 0 & y == 0) {
            System.out.println("Origem");
        } else if (x == 0 & y != 0) {
            System.out.println("Eixo Y");
        } else if (x != 0 & y == 0) {
            System.out.println("Eixo X");
        } else if (x >= 0 & y >= 0) {
            System.out.println("Q1");
        } else if (x <= 0 & y >= 0) {
            System.out.println("Q2");
        } else if (x <= 0 & y <= 0) {
            System.out.println("Q3");
        } else if (x >= 0 & y <= 0) {
            System.out.println("Q4");
        }

        // SAÍDA
        
    }
}
