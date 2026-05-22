
import java.util.Scanner;

// 11. As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes. Faça um programa que recebe o salário atual de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
    // salários até R$ 280,00 (incluindo) : aumento de 20%
    // salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
    // salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
    // salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
    // o salário antes do reajuste;
    // o percentual de aumento aplicado;
    // o valor do aumento;
    // o novo salário, após o aumento.
public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o valor do seu salário: ");
        double salario = scanner.nextDouble();

        int percentualAumento;
        if (salario <= 280) {
            percentualAumento = 20;
        } else if (salario > 280 && salario <= 700) {
            percentualAumento = 15;
        } else if (salario > 700 && salario < 1500) {
            percentualAumento = 10;
        } else {
            percentualAumento = 5;
        }
        double aumento = salario * (percentualAumento / 100);
        double novoSalario = salario + aumento;
        System.out.println("Salário antes do aumento: " + salario);
        System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
        System.out.println("Valor do aumento: " + aumento);
        System.out.println("Novo salário, após o aumento: " + novoSalario);
    }
}

