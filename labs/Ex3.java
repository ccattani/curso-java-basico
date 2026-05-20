import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor1;
        int valor2;

        System.out.println("Informe o primeiro valor:");
        valor1 = scanner.nextInt();

        System.out.println("Informe o segundo valor:");
        valor2 = scanner.nextInt();

        System.out.println("A soma desses dois valores é: " + (valor1 + valor2));
        
    }
    
}
