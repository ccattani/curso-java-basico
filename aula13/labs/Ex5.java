import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double metros;

        System.out.print("Digite a quantidade de metros: ");
        metros = scanner.nextDouble();
        double centimetros = metros * 100;
        System.out.println("A quantidade de centímetros é: " + centimetros);
    }
}
