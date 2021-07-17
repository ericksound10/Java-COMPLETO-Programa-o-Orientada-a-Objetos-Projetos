import java.util.Scanner;

public class somaDeValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, soma;

        System.out.println("Digite um número inteiro: ");
        x = sc.nextInt();
        System.out.println("Digite um número inteiro: ");
        y = sc.nextInt();

        soma = x + y;

        System.out.printf("A soma dos valores digitados é: " + soma);

    }
    
}
