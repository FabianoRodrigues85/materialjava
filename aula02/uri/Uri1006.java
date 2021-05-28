package uri;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double Notaa, Notab, Notac, MediaNota;

    ///System.out.println("Digite 3 notas");
    Notaa = entrada.nextDouble();
    Notab = entrada.nextDouble();
    Notac = entrada.nextDouble();

    MediaNota = (Notaa *2 + Notab*3 + Notac*5) / 10;

    System.out.printf("MEDIA = %.1f\n" , MediaNota);


    entrada.close();

    }
    
}
