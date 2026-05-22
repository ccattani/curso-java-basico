import java.util.Scanner;

// 10.Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N-Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o turno que você estuda (M-Matutino, V-Vespertino e N-Nortuno: ");
        String turno = scanner.next();
        turno = turno.toUpperCase(); // aceitar letra minúscula ou maiúscula

        switch (turno) {
            case "M":
                System.out.print("Bom dia!");
                break;
            case "V":
                System.out.print("Boa tarde!");
                break;
            case "N": 
                System.out.print("Boa noite!");
                break;
            default:
                System.out.print("Valor inválido");
        }
    }    
}
