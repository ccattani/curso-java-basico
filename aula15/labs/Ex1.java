import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número inteiro:");
        int numero1 = scanner.nextInt();
        System.out.println("Entre com outro número inteiro:");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2){
            System.out.println("O número " + numero1 + " é maior que o número " + numero2);
        } else {
            System.out.println("O número " + numero2 + " é maior que o número " + numero1);
        }
    }
}
