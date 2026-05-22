import java.util.Scanner;

// 23. Faça um Programa que peça um número e determine se ele é inteiro ou decimal.
public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com um número: ");
        double numero = scanner.nextDouble();

        if (numero == Math.floor(numero)){
            System.out.println("O número " + numero + " é inteiro.");
        } else {
            System.out.println("O número " + numero + " é decimal.");
        }
    }
}
