import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio;
        double area;

        System.out.print("Digite o raio do círculo: ");
        raio = scanner.nextDouble();
        area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A área do círculo é: %.2f\n", area);
    }
}
