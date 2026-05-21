import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero > 0){
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo ou zero.");
        }
    }    
}
