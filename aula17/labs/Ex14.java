
import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Entre com um número: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);

    }
}
