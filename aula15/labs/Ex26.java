import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Desconto de combustível!!!");
        System.out.print("Entre com o número de litros vendidos: ");
        double litros = scanner.nextDouble();

        System.out.println("Tipo de combustível: A - Álcool, G - Gasolina, ");
        char tipoCombustivel = scanner.next().charAt(0);

        double precoPorLitroGasolina = 2.50;
        double precoPorLitroAlcool = 1.90;

        double descontoGasolina;
        double descontoAlcool;

        if(tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            if (litros <= 20) {
                descontoGasolina = 0.04;
            } else {
                descontoGasolina = 0.06;
            }
            double valorGasolina = litros * precoPorLitroGasolina * (1 - descontoGasolina);
            System.out.println("Valor a ser pago pela gasolina: R$ " + String.format("%.2f", valorGasolina));
        } else if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
            if (litros <= 20) {
                descontoAlcool = 0.03;
            } else {
                descontoAlcool = 0.05;
            }
            double valorAlcool = litros * precoPorLitroAlcool * (1 - descontoAlcool);
            System.out.println("Valor a ser pago pelo álcool: R$ " + String.format("%.2f", valorAlcool));
        }
    }
}