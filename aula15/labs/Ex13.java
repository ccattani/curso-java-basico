
import java.util.Scanner;

// 13. Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com um dia da semana (1-7): ");
        int diaSemana = scanner.nextInt();

        switch (diaSemana) {
            case 1: // Caso o dia da semana seja 1
                System.out.println("Domingo");
                break; // Encerra o switch
            case 2: // Caso o dia da semana seja 2
                System.out.println("Segunda-feira");
                break; 
            case 3: // Caso o dia da semana seja 3
                System.out.println("Terça-feira");
                break; 
            case 4: // Caso o dia da semana seja 4
                System.out.println("Quarta-feira");
                break; 
            case 5: // Caso o dia da semana seja 5
                System.out.println("Quinta-feira");
                break; 
            case 6: // Caso o dia da semana seja 6
                System.out.println("Sexta-feira");
                break; 
            case 7: // Caso o dia da semana seja 7  
                System.out.println("Sábado");
                break; 
            default: // Caso o valor do dia da semana seja diferente de 1 a 7
                System.out.println("Valor inválido");
        }
    }
}
