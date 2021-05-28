package exemplos;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, dobro;

        /* ENTRADA */
        System.out.println("Digite um numero inteiro:");

        numero = entrada.nextInt(); // lendo um número inteiro do teclado e guardando na váriavel 'numero'

        /* PROCESSAMENTO */
        dobro = numero * 2;

        /* SAIDA */
        System.out.println("Você digitou " + numero);
        System.out.println("o dobro é " + dobro);

        entrada.close();

    }
}
