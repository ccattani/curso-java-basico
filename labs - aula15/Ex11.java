import java.util.Scanner;

public class Ex11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o valor do seu salário: ");
        double salario = scanner.nextDouble();

        if(salario <= 280){
            double aumento = salario * 0.20;
            double novoSalario = salario + aumento;
            System.out.println("Salário antes do aumento: " + salario);
            System.out.println("Percentual de aumento aplicado: 20%");
            System.out.println("Valor do aumento: " + aumento);
            System.out.println("Novo salário, após o aumento: " + novoSalario);
        } else if (salario > 280 && salario <= 700){
            double aumento = salario * 0.15;
            double novoSalario = salario + aumento;
            System.out.println("Salário antes do aumento: " + salario);
            System.out.println("Percentual de aumento aplicado: 15%");
            System.out.println("Valor do aumento: " + aumento);
            System.out.println("Novo salário, após o aumento: " + novoSalario);
        } else if (salario > 700 && salario < 1500){
            double aumento = salario * 0.10;
            double novoSalario = salario + aumento;
            System.out.println("Salário antes do aumento: " + salario);
            System.out.println("Percentual de aumento aplicado: 10%");
            System.out.println("Valor do aumento: " + aumento);
            System.out.println("Novo salário, após o aumento: " + novoSalario);
        } else {
            double aumento = salario * 0.05;
            double novoSalario = salario + aumento;
            System.out.println("Salário antes do aumento: " + salario);
            System.out.println("Percentual de aumento aplicado: 5%");
            System.out.println("Valor do aumento: " + aumento);
            System.out.println("Novo salário, após o aumento: " + novoSalario);
        }
    }
}