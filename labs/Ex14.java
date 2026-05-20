import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pesoPeixes;
        char excesso;
        double valorMulta;

        System.out.print("Digite o peso dos peixes pescados: ");
        pesoPeixes = scanner.nextDouble();
        if (pesoPeixes > 50){
            excesso = 'S';
            valorMulta = (pesoPeixes - 50) * 4;
            System.out.println("Excesso: " + excesso);
            System.out.println("Valor da multa: R$ " + valorMulta);
        } else {
            excesso = 'N';
            valorMulta = 0;
            System.out.println("Excesso: " + excesso);
            System.out.println("Valor da multa: R$ " + valorMulta);
            System.out.print("Não há excesso de peso. Parabéns!");
        }
    }
}
