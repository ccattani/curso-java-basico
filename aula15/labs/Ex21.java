import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o valor do saque: ");
        int valor = scanner.nextInt();
        if (valor >= 10 && valor <= 600) {
            int notas100 = valor / 100;
            int notas50 = (valor % 100) / 50;
            int notas10 = (valor % 50) / 10;
            int notas5 = (valor % 10) / 5;
            int notas1 = valor % 5;
            System.out.println("Notas de 100: " + notas100);
            System.out.println("Notas de 50: " + notas50);
            System.out.println("Notas de 10: " + notas10);
            System.out.println("Notas de 5: " + notas5);
            System.out.println("Notas de 1: " + notas1);
        } else {
            System.out.println("Valor inválido! Digite um valor entre 10 e 600.");
        }
    }
}
