import java.util.Scanner;

// 6. Faça um Programa que leia três números e mostre o maior deles.
public class Ex6{
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
    }
}