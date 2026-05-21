import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com a quantidade de (Kg) de morangos: ");
        double kgMorango = scanner.nextDouble();

        System.out.print("Entre com a quantidade de (Kg) de maçãs: ");
        double kgMaca = scanner.nextDouble();

        double precoMorango = kgMorango <= 5 ? 2.50 : 2.20;
        double precoMaca = kgMaca <= 5 ? 1.80 : 1.50;

        double valorMorango = kgMorango * precoMorango;
        double valorMaca = kgMaca * precoMaca;

        System.out.println("Valor a ser pago pelos morangos: R$ " + String.format("%.2f", valorMorango));
        System.out.println("Valor a ser pago pelas maçãs: R$ " + String.format("%.2f", valorMaca));
        
        double valorTotal = valorMorango + valorMaca;
        System.out.println("Valor total a ser pago: R$ " + String.format("%.2f", valorTotal));
    }    
}
