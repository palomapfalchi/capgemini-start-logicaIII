package application;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {

        char sexo = 'F';
        int totalMulheres = 0;
        int totalHomens = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i=1; i<=3; i++) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.next();
            System.out.println("Digite seu sexo: F-Feminino / M-Masculino");
            sexo = scanner.next().charAt(0);

            if (sexo == 'F' || sexo == 'f') {
                totalMulheres++;
                System.out.println("A " + nome + " é mulher!");
            } else {
                totalHomens++;
                System.out.println("O " + nome + " é homem!");
            }
        }

        System.out.println("Total de Mulheres: " + totalMulheres);
        System.out.println("Total de Homens: " + totalHomens);

    }
}
