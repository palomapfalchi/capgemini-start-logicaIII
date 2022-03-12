package application;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {

        int anoFabricacao = 0;
        float valorCarro = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorAPagar = 0.0f;

        int totalCarros = 0;
        int totalCarrosSeminovos = 0;

        Scanner scanner = new Scanner(System.in);

        char desejaRepetir = 's';
        while (desejaRepetir == 's' || desejaRepetir == 'S') {

            System.out.print("Digite o ano de fabricação do carro: ");
            anoFabricacao = scanner.nextInt();
            System.out.print("Digite o valor do carro: R$ ");
            valorCarro = scanner.nextFloat();

            if (anoFabricacao >= 2000 && anoFabricacao <= 2022) {
                porcentagemDesconto = 0.07f;
                totalCarrosSeminovos++;
            } else {
                porcentagemDesconto = 0.12f;
            }
            totalCarros++;

            valorDesconto = valorCarro * porcentagemDesconto;
            valorAPagar = valorCarro - valorDesconto;

            System.out.println("O valor do desconto foi R$: " + valorDesconto);
            System.out.println("O valor que deve ser pago é R$: " + valorAPagar);

            System.out.println("Deseja fazer mais cadastros? S-Sim / N-Não");
            desejaRepetir = scanner.next().charAt(0);

        }

        System.out.println("Total de carros semi novos: " + totalCarrosSeminovos);
        System.out.println("Total de carros: " + totalCarros);

    }
}
