import java.util.Locale;

public class Casas_Decimais{
    public static void main(String[] args) {
        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", x); //Esse é o padrão para formatação de casas decimais
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US); //para uso da classe Locale é necessário realizar a importação(import java.util.Locale;) no inicío da aplicação. É usado para trocar a vírgula por ponto ou seja usar o padrão americano.
        System.out.printf("%.3f%n", x);
    }
}