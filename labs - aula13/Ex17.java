import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da área em metros quadrados: ");
        double area = scanner.nextDouble();

        double areaComFolga = area * 1.10;

        // 1 litro cobre 6 m²
        double litrosNecessarios = areaComFolga / 6;

        // 1 - Apenas latas de 18 litros
        int latas = (int) Math.ceil(litrosNecessarios / 18);
        double precoLatas = latas * 80;

        // 2 - Apenas galões de 3.6 litros
        int galoes = (int) Math.ceil(litrosNecessarios / 3.6);
        double precoGaloes = galoes * 25;

        // 3 - Mistura de latas e galões
        int latasMistura = (int) (litrosNecessarios / 18);
        double restoLitros = litrosNecessarios % 18;
        int galoesMistura = (int) Math.ceil(restoLitros / 3.6);
        double precoMistura = (latasMistura * 80) + (galoesMistura * 25);

        // Saída
        System.out.println("\n===== RESULTADO =====");

        System.out.println("\nApenas latas de 18L:");
        System.out.println("Quantidade de latas: " + latas);
        System.out.println("Preço: R$ " + precoLatas);

        System.out.println("\nApenas galões de 3.6L:");
        System.out.println("Quantidade de galões: " + galoes);
        System.out.println("Preço: R$ " + precoGaloes);

        System.out.println("\nMistura de latas e galões:");
        System.out.println("Latas: " + latasMistura);
        System.out.println("Galões: " + galoesMistura);
        System.out.println("Preço: R$ " + precoMistura);
    }
}