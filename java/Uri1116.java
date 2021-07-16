import java.util.Scanner;

public class Uri1116 {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        int qtd = in.nextInt();
        int x = 0, y = 0;
        double divisao;
        for (int i = 0; i < qtd; i++) {
            x = in.nextInt();
            y = in.nextInt();
            double x1, y2;
            x1 = x;
            y2 = y;
            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                divisao = x1 / y2;
                System.out.println(divisao);
            }
        }
        in.close();
    }
}
