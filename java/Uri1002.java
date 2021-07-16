import java.util.Scanner;

public class Uri1002 {

    public static void main (String [] args) {
        
        // ENTRADA DE DADOS
        Scanner in = new Scanner(System.in);
        double raio = in.nextDouble();
        
        // PROCESSAMENTO
        double n = 3.14159; // Forçando o tipo 'float' para esse valor real.
        double area = n * Math.pow(raio, 2);
        // float area = (float) (n * Math.pow (raio, 2)); // lançando explícito

        // SAIDA DE DADOS
        System.out.printf("A=%.4f%n", area);
        in.close (); // finalizando o objeto.
    }
    
}