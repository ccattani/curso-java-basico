import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorHora;
        int horasTrabalhadas;
        double salario;

        System.out.println("Digite quanto você ganha por hora:");
        valorHora = scanner.nextDouble();
        System.out.println("Digite quantas horas você trabalha por mês:");
        horasTrabalhadas = scanner.nextInt();
        salario = valorHora * horasTrabalhadas;
        System.out.printf("O seu salário mensal é: %.2f\n", salario);
    }
}
