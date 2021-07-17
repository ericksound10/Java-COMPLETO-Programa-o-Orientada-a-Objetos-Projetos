import java.util.Scanner;

public class diferencaValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, dif;

        System.out.println("Digite um número inteiro: ");
        a = sc.nextInt();
        System.out.println("Digite outro número inteiro: ");
        b = sc.nextInt();
        System.out.println("Digite outro número inteiro: ");
        c = sc.nextInt();
        System.out.println("Digite outro número inteiro: ");
        d = sc.nextInt();

        dif = a*b - c*d;


        System.out.printf("Diferença é: " + dif);

    }

    
}