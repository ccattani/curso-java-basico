import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18){
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        // barato <= 10
        // 10 < valor < 15 - pedir desconto
        // 15 <= valor < 17 - pesquisar mais
        // >= 17 - muito caro
        System.out.print("Entre com o valor do produto: ");
        double valor = scanner.nextDouble();

        if (valor <= 10){
            System.out.println("Está barato, pode comprar.");
        } else if (valor > 10 && valor < 15){
            System.out.println("Peça um desconto");
        } else if (valor <= 15 && valor < 17){
            System.out.println("Pode pesquisar mais");
        } else{ // valor >= 17
            System.out.println("Está muito caro");
        }

    }
}