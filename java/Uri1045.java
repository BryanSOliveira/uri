import java.util.Arrays;
import java.util.Scanner;

public class Uri1045 {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        double [] vetor = new double [3];
        for (int i = 0; i < 3; i++) {
            vetor[i] = in.nextDouble();
        }

        in.close();
        Arrays.sort(vetor);
        double a = vetor[0];
        double b = vetor[1];
        double c = vetor[2];
        double potA = Math.pow(a, 2);
        double potB = Math.pow(b, 2);
        double potC = Math.pow(c, 2);
        if ((a >= (b + c))) {
            System.out.println("NAO FORMA TRIANGULO");
        } if ((potA == (potB + potC))) {
            System.out.println("TRIANGULO RETANGULO");
        } if ((potA > (potB + potC))) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } if ((potA < (potB + potC))) {
            System.out.println("TRIANGULO ACUTANGULO");
        } if (potA == potB & potB == potC) {
            System.out.println("TRIANGULO EQUILATERO");
        } if (potA == potB & potC != potB | 
                potA == potC & potB != potC | 
                potB == potC & potA != potC) {
                    System.out.println("TRIANGULO ISOSCELES");
        }

    }
}
