import java.util.Scanner;

// 27. Uma fruteira está vendendo frutas com a seguinte tabela de preços:
// Até 5 Kg Acima de 5 Kg
// Morango R$ 2,50 por Kg R$ 2,20 por Kg
// Maçã R$ 1,80 por Kg R$ 1,50 por Kg
// Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
// compra ultrapassar R$ 25,00, receberá ainda um desconto de
// 10% sobre este total. Escreva um algoritmo para ler a
// quantidade (em Kg) de morangos e a quantidade (em Kg) de
// maças adquiridas e escreva o valor a ser pago pelo cliente.
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

        if (valorTotal > 25 || (kgMorango + kgMaca) > 8) {
            double desconto = valorTotal * 0.10;
            double valorComDesconto = valorTotal - desconto;
            System.out.println("Valor com desconto de 10%: R$ " + String.format("%.2f", valorComDesconto));
        }
    }    
}
