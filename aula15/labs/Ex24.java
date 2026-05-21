import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com dois números: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação: 1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão");
        int operacao = scanner.nextInt();
        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }
        System.out.println("Resultado: " + resultado);
    }
}
