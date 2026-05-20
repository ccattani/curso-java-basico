import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota1;
        int nota2;
        int nota3;
        int nota4;

        double media;

        System.out.println("Informe a primeira nota: ");
        nota1 = scanner.nextInt();
        System.out.println("Informe a segunda nota: ");
        nota2 = scanner.nextInt();
        System.out.println("Informe a terceira nota: ");
        nota3 = scanner.nextInt();
        System.out.println("Informe a quarta nota: ");
        nota4 = scanner.nextInt();
        media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        System.out.println("A média das notas é: " + media);
    }
}
