import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        while (nome.length() <= 3){
            System.out.print("Entre com seu nome. Ele precisa ter mais de 3 caracteres: ");
            nome = scanner.nextLine();
        }

        System.out.println("Idade: ");
        int idade = scanner.nextInt();

        while (idade < 0 || idade > 150){
            System.out.print("Entre com sua idade. Ela precisa ser entre 0 e 150: ");
            idade = scanner.nextInt();
        }
        
        System.out.println("Salário: ");
        double salario = scanner.nextDouble();

        while (salario <= 0){
            System.out.print("Entre com seu salário. Ele precisa ser maior que 0: ");
            salario = scanner.nextDouble();
        }
        System.out.println("Sexo: ");
        char sexo = scanner.next().charAt(0);

        while (sexo != 'f' && sexo != 'm'){
            System.out.print("Entre com seu sexo. Ele precisa ser 'f' ou 'm': ");
            sexo = scanner.next().charAt(0);
        }
        System.out.println("Estado Civil: ");
        char estadoCivil = scanner.next().charAt(0);

        while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd'){
            System.out.print("Entre com seu estado civil. Ele precisa ser 's', 'c', 'v' ou 'd': ");
            estadoCivil = scanner.next().charAt(0);
        }
        
        System.out.println("Dados válidos:");
    }
}
