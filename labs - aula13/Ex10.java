import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperaturaCelsius;
        double temperaturaFahrenheit;

        System.out.println("Digite a temperatura em Celsius para converter para Fahrenheit:");
        temperaturaCelsius = scanner.nextDouble();
        temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;
        System.out.printf("A temperatura em Fahrenheit é: %.2f\n", temperaturaFahrenheit);
    }
}
