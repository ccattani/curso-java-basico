import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double altura;
        char sexo;
        double peso;

        System.out.println("Digite a altura em metros para calcular seu peso ideal:");
        altura = scanner.nextDouble();
        System.out.println("Digite o sexo (M para masculino, F para feminino):");
        sexo = scanner.next().charAt(0);
        System.out.println("Digite seu peso atual em kg: ");
        peso = scanner.nextDouble();

        if (sexo == 'M'){
            System.out.printf("O seu peso ideal é de: %.2f\n", ((72.7 * altura) - 58));
            if (peso > ((72.7 * altura) - 58)) {
                System.out.println("Você está acima do peso ideal.");
            } else if (peso < ((72.7 * altura) - 58)) {
                System.out.println("Você está abaixo do peso ideal.");
            } else {
                System.out.println("Você está no peso ideal.");
            }
        } else {
            System.out.printf("O seu peso ideal é de: %.2f\n", ((62.1 * altura) - 44.7));
            if (peso > ((62.1 * altura) - 44.7)) {
                System.out.println("Você está acima do peso ideal.");
            } else if (peso < ((62.1 * altura) - 44.7)) {
                System.out.println("Você está abaixo do peso ideal.");
            } else {
                System.out.println("Você está no peso ideal.");
            }
        }
    }
}
