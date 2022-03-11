package application;

import java.util.Scanner;

    public class ex15 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero >= 100 & numero <= 200) {
                System.out.println("O número " + numero + " está entre 100 e 200");
            } else {
                if (numero < 100) {
                    System.out.println("O número " + numero + " é menor que 100");
                } else {
                    System.out.println("O número " + numero + " é maior que 200");
                }
            }
        }
    }
