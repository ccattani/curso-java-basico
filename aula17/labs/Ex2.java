import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o nome de usuário: ");
        String username = scanner.nextLine();

        System.out.print("Entre com a senha: ");
        String password = scanner.nextLine();

        while (password.equals(username)){
            System.out.print("Senha inválida. Entre com uma senha diferente do nome de usuário: ");
            password = scanner.nextLine();
        }
        System.out.println("Senha válida.");
    } 
}
