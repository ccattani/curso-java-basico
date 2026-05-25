
import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com um número fatorial: ");
        int num = scanner.nextInt();

        System.out.print(num + "! = ");
        int fatorial = 1;

        for (int i = num; i > 0; i--) {
            fatorial *= i;
            System.out.print(i + " ");
        }
        System.out.println("Resultado: " + fatorial);
    }
}
