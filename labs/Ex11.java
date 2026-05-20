import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorInteiro1;
        int valorInteiro2;
        double valorReal;

        System.out.println("Digite o primeiro valor inteiro:");
        valorInteiro1 = scanner.nextInt();  
        System.out.println("Digite o segundo valor inteiro:");
        valorInteiro2 = scanner.nextInt();
        System.out.println("Digite um valor real:");
        valorReal = scanner.nextDouble();

        System.out.println("O produto do dobro do primeiro valor inteiro com metade do segundo valor inteiro é: " + (2 * valorInteiro1 * (valorInteiro2 / 2)));

        System.out.println("A soma do triplo do primeiro valor inteiro com o terceiro valor é: " + ((3 * valorInteiro1) + valorReal));

        System.out.printf("O terceiro valor elevado ao cubo é: %.2f\n ", Math.pow(valorReal, 3));
    }
}
