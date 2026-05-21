
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com uma nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Entre com outra nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.print("Aprovado com distinção");
        } else if (media >= 7) {
            System.out.print("Aprovado");
        } else {
            System.out.print("Reprovado");
        }
    }
}
