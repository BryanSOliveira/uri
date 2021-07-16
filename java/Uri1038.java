import java.util.Scanner;

public class Uri1038 {
    public static void main(String[] args) {
        
        // ENTRADA
        Scanner in = new Scanner(System.in);
        int codigo = in.nextInt();
        int quantidade = in.nextInt();
        double total = 0;
        
        in.close();

        // PROCESSAMENTO
        if (codigo == 1) {
            total = quantidade * 4.00;
            System.out.printf("Total: R$ %.2f\n", total);
        } else if (codigo == 2) {
            total = quantidade * 4.50;
            System.out.printf("Total: R$ %.2f\n", total);
        } else if (codigo == 3) {
            total = quantidade * 5.00;
            System.out.printf("Total: R$ %.2f\n", total);
        } else if (codigo == 4) {
            total = quantidade * 2.00;
            System.out.printf("Total: R$ %.2f\n", total);
        } else if (codigo == 5) {
            total = quantidade * 1.50;
            System.out.printf("Total: R$ %.2f\n", total);
        }

        // SAÍDA
        
    }
}
