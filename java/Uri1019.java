import java.util.Scanner;

public class Uri1019 {
    public static void main(String [] args) {
        // ENTRADA
        Scanner in = new Scanner (System.in);
        int tempo = in.nextInt();
        in.close();

        //PROCESSAMENTO
        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        int resto = 0;

        horas = tempo / 3600;
        resto = tempo % 3600;

        minutos = resto / 60;
        resto = resto % 60;

        segundos = resto;

        System.out.println(horas + ":" + minutos + ":" + segundos);


    }
    
}
