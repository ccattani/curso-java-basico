
import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        int inicio = scanner.nextInt();

        System.out.println("Entre com outro número inteiro: ");
        int fim = scanner.nextInt();

        if (inicio > fim) {
            int temp = inicio;
            inicio = fim;
            fim = temp;
        }

        System.out.print("Intervalo: ");
        int somatorio = 0;
        for (int i = inicio; i <= fim; i++) {
            System.out.print(i + " ");
            somatorio += i;
        }
        System.out.println("\nSomatório: " + somatorio);

    }
}
