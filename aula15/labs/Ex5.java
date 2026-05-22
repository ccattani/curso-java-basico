
import java.util.Scanner;

// 5. Faça um programa para a leitura de duas notas parciais de um aluno.
// O programa deve calcular a média alcançada por aluno e apresentar:
// A mensagem "Aprovado", se a média alcançada for maior ou igual a 7;
// A mensagem "Reprovado", se a média for menor do que 7;
// A mensagem "Aprovado com Distinção", se a média for igual a 10.

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
