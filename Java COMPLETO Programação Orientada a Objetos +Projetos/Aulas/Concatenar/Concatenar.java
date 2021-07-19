public class Concatenar {
    public static void main(String[] args) {
        Double x = 20.565;
        System.out.println("Resutado = " + x + " Metros");
        //modelo impresão PrintF ou seja com formatação.
        System.out.printf("Resultado = %.2f metros%n", x); 

        // ------------------------------------------//
        //Concatenar tipo de Variaveis diferentes
       // %f = ponto flutuante - ex.: double
       // %d = variavel do tipo inteiro - 'int' 
       // %s = variavel tipo texto

        String nome = "Maria";
        int idade = 32;
        double renda = 4000.00;
        System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, renda); //a ordem das variaveis devem ser colocadas conforme deseja a impressão.

    }
    
}
