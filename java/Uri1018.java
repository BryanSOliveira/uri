import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        
        // ENTRADA
        Scanner in = new Scanner(System.in);
        int valor = in.nextInt();
        int cem = 0;
        int cinquenta = 0;
        int vinte = 0;
        int dez = 0;
        int cinco = 0;
        int dois = 0;
        int um = 0;

        in.close();

        // PROCESSAMENTO
        cem = valor/100;
        valor %= 100;
        cinquenta = valor/50;
        valor %= 50;
        vinte = valor/20;
        valor %= 20;
        dez = valor/10;
        valor %= 10;
        cinco = valor/5;
        valor %= 5;
        dois = valor/2;
        valor %= 2;
        um = valor/1;

        // SAÍDA
        System.out.println(cem + " nota(s) de R$100,00");
        System.out.println(cinquenta + " nota(s) de R$50,00");
        System.out.println(vinte + " nota(s) de R$20,00");
        System.out.println(dez + " nota(s) de R$10,00");
        System.out.println(cinco + " nota(s) de R$5,00");
        System.out.println(dois + " nota(s) de R$2,00");
        System.out.println(um + " nota(s) de R$1,00");
    }
}
