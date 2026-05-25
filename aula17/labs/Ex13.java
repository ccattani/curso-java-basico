
import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int base = scanner.nextInt();
        System.out.println("Entre com um outro número: ");
        int expoente = scanner.nextInt();

        int resultado = base;

        for (int i = 1; i < expoente; i++) {
            resultado *= base;
        }

        System.out.print("Resultado: " + resultado);
    }
}
