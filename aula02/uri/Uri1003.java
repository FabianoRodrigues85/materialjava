package uri;

/**
 * Uri1003
 */
import java.util.Scanner;

public class Uri1003 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, soma;

        System.out.println("Digite dois numeros");
        a = entrada.nextInt();
        b = entrada.nextInt();

        soma = a + b;

        System.out.println("SOMA = " + soma);

        entrada.close();
    }
}