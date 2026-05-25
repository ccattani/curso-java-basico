
import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com um número inteiro para ver sua tabuada: ");
        int numero = scanner.nextInt();
        System.out.println("Tabuada de " + numero + ": ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
}
