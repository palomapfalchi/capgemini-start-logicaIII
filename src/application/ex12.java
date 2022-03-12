package application;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do carro a preço de fábrica: R$ ");
        float custoFabrica = scanner.nextFloat();

        double lucroDistribuidor = custoFabrica * 0.28;
        double impostos = custoFabrica * 0.45;

        double custoFinal = custoFabrica + lucroDistribuidor + impostos;

        System.out.println("Valor final do veículo R$ " + custoFinal);
    }
}
