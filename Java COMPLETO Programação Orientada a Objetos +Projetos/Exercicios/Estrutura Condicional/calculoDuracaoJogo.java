import java.util.Scanner;

public class calculoDuracaoJogo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, duracao;

        System.out.println("Digite a hora inicial do Jogo: ");
        horaInicial  = sc.nextInt();
        System.out.println("Digite a hora final do Jogo: ");
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;

            
        } else {
            duracao = 24 - horaInicial + horaFinal;
            
        }

        System.out.println("O jogo durou " + duracao + " hora(s)");



        sc.close();
    }
    
}
