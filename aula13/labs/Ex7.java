import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double comprimento;
        double area;

        System.out.println("Digite o comprimento do lado do quadrado para calcular a área:");
        comprimento = scanner.nextDouble();
        area = Math.pow(comprimento, 2);
        System.out.printf("A área do quadrado é: %.2f\n", area);
        System.out.println("O dobro da área do quadrado é: " + (area * 2));
    }
}
