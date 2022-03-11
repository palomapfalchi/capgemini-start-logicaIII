package application;

import java.util.Scanner;

public class ex24 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's'){
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("O número é igual a zero!");
            } else if (numero > 0) {
                System.out.println("O número " + numero + " é positivo!");
            } else {
                System.out.println("O número " + numero + " é negativo!");
            }
            System.out.println("Deseja continuar? S - Sim / N - Não" );
            desejaContinuar = scanner.next().charAt(0);
        }
    }
}
