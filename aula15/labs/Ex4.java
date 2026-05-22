import java.util.Scanner;

// 4. Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
public class Ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com uma letra: ");
        char letra = scanner.next().charAt(0);

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' ||
            letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra '" + letra + "' é uma vogal.");
        } else {
            System.out.println("A letra '" + letra + "' é uma consoante.");
        }
    }
}
