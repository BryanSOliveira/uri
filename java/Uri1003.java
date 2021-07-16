import java.util.Scanner;

public class Uri1003 {

    public static void main (String [] args) {
        
        // ENTRADA DE DADOS
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close (); // finalizando o objeto.
        
        // PROCESSAMENTO
        int soma = a + b;

        // SAIDA DE DADOS
        System.out.println("SOMA = " + soma);
    }
    
}