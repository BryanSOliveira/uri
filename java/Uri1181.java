import java.util.Scanner;

public class Uri1181 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        char ope = in.next().charAt(0);
        float [][] matriz = new float [3][3];
        float soma = 0;
        float media = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = in.nextFloat();
            }
        }

        for (int j = 0; j < 3; j++) {
            soma = soma + matriz[num-1][j];
        }

        in.close();

        if(ope == 'S') {
            System.out.printf("%.1f\n", soma);
        } else if(ope == 'M') {
            media = soma / 3;
            System.out.printf("%.1f\n", media);
        }
    }
}
