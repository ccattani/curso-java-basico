import java.util.Scanner;


// 12. Faça um programa para a leitura de um valor de hora de trabalho e número de horas trabalhadas no mês. O programa deve calcular o salário bruto do funcionário, o valor do imposto de renda, o valor do INSS, o valor do FGTS e o salário líquido do funcionário, conforme as regras abaixo:
    // - Salário Bruto: valor da hora de trabalho multiplicado pelo número de horas trabalhadas no mês.
    // - Imposto de Renda: 
        // - Salário Bruto até R$ 900,00 (inclusive) - isento
        // - Salário Bruto até R$ 1500,00 (inclusive) - desconto de 5%
        // - Salário Bruto até R$ 2500,00 (inclusive) - desconto de 10%
        // - Salário Bruto acima de R$ 2500,00 - desconto de 20%
    // - INSS: desconto de 10%
    // - FGTS: valor do salário bruto multiplicado por 11% (o FGTS não é descontado, é a empresa que deposita)
    // - Salário Líquido: salário bruto menos os descontos do imposto de renda e do INSS.
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
