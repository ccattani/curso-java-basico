
import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com três valores inteiros: ");
        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();
        int valor3 = scanner.nextInt();

        if (valor1 >= valor2 && valor1 >= valor3) {
            if (valor2 >= valor3) {
                System.out.println(valor1 + ", " + valor2 + ", " + valor3);
            } else {
                System.out.println(valor1 + ", " + valor3 + ", " + valor2);
            }
        } else if (valor2 >= valor1 && valor2 >= valor3) {
            if (valor1 >= valor3) {
                System.out.println(valor2 + ", " + valor1 + ", " + valor3);
            } else {
                System.out.println(valor2 + ", " + valor3 + ", " + valor1);
            }
        } else {
            if (valor1 >= valor2) {
                System.out.println(valor3 + ", " + valor1 + ", " + valor2);
            } else {
                System.out.println(valor3 + ", " + valor2 + ", " + valor1);
            }
        }
    }
}
