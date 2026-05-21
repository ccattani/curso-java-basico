import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entre com o valor da sua hora trabalhada: ");
        double valorHora = scanner.nextDouble();
        System.out.print("Entre com o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double impostoRenda;

        if(salarioBruto <= 900){
            impostoRenda = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500){
            impostoRenda = salarioBruto * 0.05;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500){
            impostoRenda = salarioBruto * 0.10;
        } else {
            impostoRenda = salarioBruto * 0.20;
        }
        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("Imposto de renda: " + impostoRenda);
        System.out.println("INSS: " + (salarioBruto * 0.10));
        System.out.println("FGTS: " + (salarioBruto * 0.11));
        System.out.println("Total de descontos: " + (impostoRenda + (salarioBruto * 0.10)));
        System.out.println("Salário líquido: " + (salarioBruto - impostoRenda - (salarioBruto * 0.10)));
    }
}
