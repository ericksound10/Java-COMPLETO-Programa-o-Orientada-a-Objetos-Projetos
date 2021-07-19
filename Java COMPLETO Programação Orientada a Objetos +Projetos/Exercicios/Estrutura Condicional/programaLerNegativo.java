import java.util.Scanner;

public class programaLerNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Número Negativo");
            
        } else { 
            System.out.println("Número Positivo");
            
        }

        sc.close();
    }
    
}
