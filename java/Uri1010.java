import java.util.Scanner;

public class Uri1010 {

    public static void main (String [] args) {

        // Entrada de Dados
        Scanner in = new Scanner(System.in);
        // int codigo1 = in.nextInt();
        int numerodepecas1 = in.nextInt();
        double valorunitario1 = in.nextDouble();
        // int codigo2 = in.nextInt();
        int numerodepecas2 = in.nextInt();
        double valorunitario2 = in.nextDouble();
        in.close();

        // Processamento
        double total = (numerodepecas1 * valorunitario1) + (numerodepecas2 * valorunitario2);


        // Saída
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

    }
}
