import java.util.Scanner;

public class Ex1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com uma nota (0 - 10): ");
        double nota = scanner.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.print("Nota inválida. Entre com uma nota (0 - 10): ");
            nota = scanner.nextDouble();
        }

        System.out.println("Nota válida: " + nota);

    }
}