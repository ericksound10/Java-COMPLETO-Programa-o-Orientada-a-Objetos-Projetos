import java.util.Scanner;

public class calculo_Produto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int produto1, produto2, quant1, quant2;
        double valorProd1, valorProd2, soma;

        System.out.println("Digite o código do produto: ");
        produto1 = sc.nextInt();
        System.out.println("Digite a quantidade: ");
        quant1 = sc.nextInt();
        System.out.println("Digite o valor unitário do produto: ");
        valorProd1 = sc.nextDouble();

        System.out.println("Digite o código do produto: ");
        produto2 = sc.nextInt();
        System.out.println("Digite a quantidade: ");
        quant2 = sc.nextInt();
        System.out.println("Digite o valor unitário do produto: ");
        valorProd2 = sc.nextDouble();

        soma = valorProd1 * quant1 + valorProd2 * quant2;
        System.out.printf("Quantidade de %d e Valor do Item 1 é R$: %.2f%n", quant1, valorProd1);
        System.out.printf("Quantidade de %d e Valor do item 2 é R$: %.2f%n", quant2, valorProd2);


        System.out.printf("Valor total a pagar é R$ " + soma);

        sc.close();

    }

}
