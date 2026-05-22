import java.util.Scanner;

//8. Faça um programa que pergunte o preço de três produtos e informe
// qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o valor dos 3 produtos: ");
        double produto1 = scanner.nextDouble();
        double produto2 = scanner.nextDouble();
        double produto3 = scanner.nextDouble();

        if(produto1 < produto2 && produto1 < produto3) {
            System.out.println("O produto mais barato é: " + produto1 + " compre o produto 1");
        } else if (produto2 < produto1 && produto2 < produto3) {
            System.out.println("O produto mais barato é: " + produto2 + " compre o produto 2");
        } else {
            System.out.println("O produto mais barato é: " + produto3 + " compre o produto 3");
        }
    }
}
