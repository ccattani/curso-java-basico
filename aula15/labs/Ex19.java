import java.util.Scanner;


// 19. Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo. Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
// o 326 = 3 centenas, 2 dezenas e 6 unidades
// o 12 = 1 dezena e 2 unidades
public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com um número inteiro menor que 1000: ");
        int numero = scanner.nextInt();

        if (numero >= 0 && numero < 1000) {
            int centenas = numero / 100;
            int dezenas = (numero % 100) / 10;
            int unidades = numero % 10;

            StringBuilder resultado = new StringBuilder(); // usado para fazer várias concatenações de string de forma eficiente

            if (centenas > 0) {
                resultado.append(centenas).append(" centena");
                if (centenas > 1) resultado.append("s");
            }
            if (dezenas > 0) {
                if (resultado.length() > 0) resultado.append(centenas > 0 && unidades > 0 ? ", " : " e ");
                resultado.append(dezenas).append(" dezena");
                if (dezenas > 1) resultado.append("s");
            }
            if (unidades > 0 || numero == 0) {
                if (resultado.length() > 0) resultado.append(" e ");
                resultado.append(unidades).append(" unidade");
                if (unidades != 1) resultado.append("s");
            }

            System.out.println(resultado);
        } else {
            System.out.println("Número inválido! Digite um número entre 0 e 999.");
        }
    }
}