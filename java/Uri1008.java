import java.util.Scanner;
public class Uri1008 {
    public static void main(String[] args) {
        
        // ENTRADA
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();
        int horas = in.nextInt();
        double valor = in.nextDouble();
        in.close();

        // PROCESSAMENTO
        double salario = horas * valor;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}
