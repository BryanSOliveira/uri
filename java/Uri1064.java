import java.util.Scanner;

public class Uri1064 {
    public static void main(String [] args) {

        double soma = 0;
        int qtd = 0;
        Scanner in = new Scanner (System.in);
        
        for (int i = 1; i <= 6; i++) {
            double numero = in.nextDouble();
            
            if (numero > 0) {
                qtd++;
                soma += numero;
            }
        }
        in.close();

        double media = soma / qtd;
        System.out.println(qtd + " valores positivos");
        System.out.printf("%.1f\n", media);
    }
}