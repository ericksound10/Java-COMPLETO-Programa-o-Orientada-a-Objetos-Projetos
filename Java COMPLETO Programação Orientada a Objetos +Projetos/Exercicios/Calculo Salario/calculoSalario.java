import java.util.Scanner;

public class calculoSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFun;
        double horasTrab, valorHora, salario;

        System.out.println("Digite o seu número de matricula: ");
        numFun = sc.nextInt();
        System.out.println("Digite o número de horas trabalhadas: ");
        horasTrab = sc.nextDouble();
        System.out.println("Digite o valor que recebe por hora trabalhada: ");
        valorHora = sc.nextDouble();

        salario = horasTrab * valorHora;

        System.out.printf("Funcionário número: " + numFun + "%n");

        System.out.printf("Seu salário é: R$ %.2f%n", salario);

        sc.close();

    }
    
}
