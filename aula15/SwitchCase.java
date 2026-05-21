
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um dia da semana (1-7):");
        int diaSemana = scanner.nextInt();

        // if (diaSemana == 1) {
        //     System.out.println("Domingo");
        // } else if (diaSemana == 2) {
        //     System.out.println("Segunda-feira");
        // } else if (diaSemana == 3) {
        //     System.out.println("Terça-feira");
        // } else if (diaSemana == 4) {
        //     System.out.println("Quarta-feira");
        // } else if (diaSemana == 5) {
        //     System.out.println("Quinta-feira");
        // } else if (diaSemana == 6) {
        //     System.out.println("Sexta-feira");
        // } else if (diaSemana == 7) {
        //     System.out.println("Sábado");
        // } else {
        //     System.out.println("Valor inválido");
        // }

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
