import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperaturaFahrenheit;
        double temperaturaCelsius;

        System.out.println("Digite a temperatura em Fahrenheit para converter para Celsius:");
        temperaturaFahrenheit = scanner.nextDouble();
        temperaturaCelsius = (5 * (temperaturaFahrenheit - 32) / 9);
        System.out.printf("A temperatura em Celsius é: %.2f\n", temperaturaCelsius);
    }
}
