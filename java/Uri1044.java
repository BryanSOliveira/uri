import java.util.Scanner;

public class Uri1044 {
    public static void main(String[] args) {
        
        // ENTRADA
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        
        in.close();

        // PROCESSAMENTO
        if (A > B) {
            if (A % B == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        } else {
            if (B % A == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        

        // SAÍDA
        
    }
}
}
