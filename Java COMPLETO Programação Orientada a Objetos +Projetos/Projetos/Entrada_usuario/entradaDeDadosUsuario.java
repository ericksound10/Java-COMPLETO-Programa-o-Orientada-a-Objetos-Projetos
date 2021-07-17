import java.util.Scanner;

import java.util.Scanner;

public class entradaDeDadosUsuario {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String x;
        
        x = sc.next(); //sc.next serve para ler String
        System.out.println("Você digitou: " + x);

        int t;
        t = sc.nextInt(); // nextInt serve para ler um número inteiro que o usuário digitou
        System.out.println("Você digitou um número inteiro: " + t);

        sc.close();
    }
    
}