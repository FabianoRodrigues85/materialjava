package uri;

import java.util.Scanner;

public class Uri1010 {
     public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double peca1, numero1, peca2, numero2, valorpagar;
        
        //System.out.println("Digite o numero da peça 1, a quantidade e o valor unitário");
        entrada.nextInt();
        peca1= entrada.nextDouble();
        numero1= entrada.nextDouble();

        //System.out.println("Digite o numero da peça 2, a quantidade e o valor unitário");
        entrada.nextInt();
        peca2= entrada.nextDouble();
        numero2= entrada.nextDouble();

        valorpagar = (numero1 * peca1) + (numero2 * peca2 );

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorpagar);

        entrada.close();

    }
}
