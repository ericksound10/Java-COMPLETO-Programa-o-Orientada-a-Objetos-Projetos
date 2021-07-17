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

        double d;
        d = sc.nextDouble(); //nextDouble serve para ler número com ponto flutuante
        System.out.println("Você digitou: " + d); 

        char c;
        c = sc.next().charAt(0); //charAt(0) = Serve para Ler o primeiro Caracter da String digitada
        System.out.printf("Você digitou: " + c);

        sc.close();
    }
    
}