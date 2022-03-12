package application;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        float totalCompra;
        float valorParcela;

        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        totalCompra = scanner.nextFloat();

        valorParcela = totalCompra / 5;
        System.out.println("5 parcelas de R$: " + valorParcela);
    }
}
