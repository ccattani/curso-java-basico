import java.util.Scanner;

// 21. Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois informar quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar com a quantidade de notas existentes na máquina.
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
