import java.util.Scanner;

public class Uri1070 {
    public static void main(String [] args) {
        Scanner in = new Scanner (System.in);
        int numero = in.nextInt();
        in.close();
        int cont = 0;

        while(cont != 6) {
            if (numero % 2 != 0) {
                cont++;
                System.out.println(numero);
            }
            numero++;
        }
    } 
}
