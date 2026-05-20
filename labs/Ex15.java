import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorPorHora;
        double horasTrabalhadas;

        System.out.print("Digite o valor por horas trabalhadas: ");
        valorPorHora = scanner.nextDouble();
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = scanner.nextDouble();

        double salarioBruto = valorPorHora * horasTrabalhadas;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDesconto = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDesconto;

        System.out.println("Total do bruto: R$ " + salarioBruto);
        System.out.println("Total do INSS: R$ " + inss);
        System.out.println("Total do sindicato: R$ " + sindicato);
        System.out.println("Total do IR: R$ " + ir);
        System.out.println("Total do desconto: R$ " + totalDesconto);
        System.out.println("Total do líquido: R$ " + salarioLiquido);
    }
}
