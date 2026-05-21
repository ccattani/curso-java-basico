import java.util.Scanner;

public class Ex7 {
        public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite três números inteiros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();                       
        int num3 = scanner.nextInt();               
        
        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("O maior número é: " + num3);
        }

        if (num1 < num2 && num1 < num3) {
            System.out.println("O menor número é: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("O menor número é: " + num2);
        } else {
            System.out.println("O menor número é: " + num3);
        }
    }
}
