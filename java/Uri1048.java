import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        // ENTRADA
        Scanner in = new Scanner(System.in);
        double salario = in.nextDouble();
        in.close();

        // PROCESSAMENTO
        int porcentagem = 0;
        double reajuste = 0;

        if (salario >= 0 & salario <= 400) {
            porcentagem = 15;
            reajuste = (salario * porcentagem)/100;
            salario += reajuste;
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: " + porcentagem + " %");
        } else if (salario > 400 & salario <= 800) {
            porcentagem = 12;
            reajuste = (salario * porcentagem)/100;
            salario += reajuste;
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: " + porcentagem + " %");
        } else if (salario > 800 & salario <= 1200) { 
            porcentagem = 10;
            reajuste = (salario * porcentagem)/100;
            salario += reajuste;
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: " + porcentagem + " %");
        } else if (salario > 1200 & salario <= 2000) {
            porcentagem = 7;
            reajuste = (salario * porcentagem)/100;
            salario += reajuste;
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: " + porcentagem + " %");
        } else if (salario > 2000) {
            porcentagem = 4;
            reajuste = (salario * porcentagem)/100;
            salario += reajuste;
            System.out.printf("Novo salario: %.2f\n", salario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: " + porcentagem + " %");
        }
    }
}