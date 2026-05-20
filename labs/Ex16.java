import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tamanhoMetrosQuadrados;
        double litrosNecessarios;
        double latasNecessarias;

        System.out.print("Digite o tamanho da área a ser pintada em metros quadrados: ");
        tamanhoMetrosQuadrados = scanner.nextDouble();
        litrosNecessarios = tamanhoMetrosQuadrados / 3; // 1 litro para cada 3 metros quadrados
        latasNecessarias = Math.ceil(litrosNecessarios / 18);
        System.out.println("Quantidade de litros necessários: " + litrosNecessarios);
        System.out.println("Quantidade de latas necessárias: " + latasNecessarias);
        System.out.println("Valor total: R$ " + (latasNecessarias * 80.00));
    }
}
