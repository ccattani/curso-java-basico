import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double altura;

        System.out.println("Digite a altura em metros para calcular seu peso ideal:");
        altura = scanner.nextDouble();
        System.out.printf("O seu peso ideal é: %.2f\n", (72.7 * altura) - 58);
    }
}
