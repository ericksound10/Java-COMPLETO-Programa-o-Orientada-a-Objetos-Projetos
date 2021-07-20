import java.util.Scanner;

public class ProgramaLerParOuImpar {
    public static void main(String[] args) {
        
        Scanner  sc = new Scanner(System.in);

        int numero; 
        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        if ( numero % 2 == 0) {
            System.out.println("Número digitado é par: ");
            
        } else { 
            System.out.println("Número digitado é impar: ");
            
        }

        sc.close();
    }
    
}
