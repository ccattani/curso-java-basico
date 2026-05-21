import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com a letra 'F' ou 'M': ");
        char letra = scanner.next().charAt(0);

        switch(letra){
            case 'F': 
                System.out.println("F - Feminino");
                break;
            case 'M':
                System.out.println("M - Masculino");
                break;
            default:
                System.out.println("Sexo inválido.");
        }
    }
}
