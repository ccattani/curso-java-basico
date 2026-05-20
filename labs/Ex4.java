import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;

        System.out.println("Informe a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.println("Informe a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.println("Informe a terceira nota: ");
        nota3 = scanner.nextDouble();

        System.out.println("Informe a quarta nota: ");
        nota4 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        System.out.println("A média das notas é: " + media);
    }
}
