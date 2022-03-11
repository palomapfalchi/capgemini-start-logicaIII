package application;

import java.util.Scanner;

public class ex22 {

    public static void main(String[] args) {

        String nomeProduto;
        float precoCusto;
        float precoVenda;

        float totalCusto = 0.0f;
        float totalVenda = 0.0f;

        Scanner scanner = new Scanner(System.in);
        int i;
        for (i=0; i<3; i++) {
            System.out.print("Digite o nome do produto: ");
            nomeProduto = scanner.next();
            System.out.print("Digite o preço de custo: R$ ");
            precoCusto = scanner.nextFloat();
            System.out.print("Digite o preço de venda: R$ ");
            precoVenda = scanner.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if (precoCusto == precoVenda) {
                System.out.println("Houve empate!");
            } else {
                if (precoCusto > precoVenda) {
                    System.out.println("Houve prejuízo!");
                } else {
                    System.out.println("Houve lucro!");
                }
            }
            System.out.println(nomeProduto + ", preço de custo: R$ " + precoCusto + ", preço de venda: R$ " + precoVenda);
        }
        System.out.println("Média do preço de custo: R$ " + (totalCusto/i));
        System.out.println("Média do preço de venda: R$ " + (totalVenda/i));
    }
}
