import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        int metros = 2;
        int centimetros = metros * 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de metros: ");
        metros = scanner.nextInt();
        centimetros = metros * 100;
        System.out.println("A quantidade de centímetros é: " + centimetros);
    }
}
