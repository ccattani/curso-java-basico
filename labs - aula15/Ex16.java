
import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        System.out.print("Entre com o valor de a: ");
        a = scanner.nextDouble();

        if (a == 0) {
            System.out.print("Não é uma equação do segundo grau. Não é possível continuar o cálculo.");
            return;
        } else {
            System.out.print("Entre com o valor de b: ");
            b = scanner.nextDouble();
            System.out.print("Entre com o valor de c: ");
            c = scanner.nextDouble();
        }

        double delta = (b * b) - (4 * a * c);

        if (delta < 0){
            System.out.print("A equação não possui raízes reais.");
        } else if (delta == 0){
            double raiz = -b / (2 * a);
            System.out.print("A equação possui uma raiz real: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais: " + raiz1 + " e " + raiz2);
        }

    }
}
