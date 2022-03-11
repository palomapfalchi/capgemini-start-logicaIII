package application;

import java.util.Scanner;

public class ex16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.println("Digite as 3 notas do aluno " + nomeAluno);
        double nota1 = scanner.nextInt();
        double nota2 = scanner.nextInt();
        double nota3 = scanner.nextInt();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Média: " + media + " Aluno Aprovado!");
        } else {
            if (media >= 5.1 & media <= 6.9) {
                System.out.println("Média: " + media + " Aluno em Recuperação!");
            } else {
                System.out.println("Média: " + media + " Aluno Reprovado!");
            }
        }

    }
}
