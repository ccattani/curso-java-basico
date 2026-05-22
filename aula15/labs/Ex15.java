import java.util.Scanner;

// Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ouescaleno.
// o Dicas:
    // o Três lados formam um triângulo quando a soma de quaisquer
    // dois lados for maior que o terceiro;
    // o Triângulo Equilátero: três lados iguais;
    // o Triângulo Isósceles: quaisquer dois lados iguais;
    // o Triângulo Escaleno: três lados diferentes;
public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o valor de 3 lados de um triânculo: ");
        double lado1 = scanner.nextDouble();
        double lado2 = scanner.nextDouble();
        double lado3 = scanner.nextDouble();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } 
    }
}
