import java.util.Scanner;
public class Uri1007 {
    public static void main(String[] args) {
        
        // ENTRADA
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        
        in.close();

        // PROCESSAMENTO
        int diferença = (A * B - C * D);

        // SAÍDA
        System.out.println("DIFERENCA = " + diferença);
    }
}
