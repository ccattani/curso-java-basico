import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanhao do arquivo para download (em MB): ");
        double tamanhoArquivoMB = scanner.nextDouble();

        System.out.print("Digite a velocidade da internet (em Mbps): ");
        double velocidadeInternetMbps = scanner.nextDouble();

        // Calcular e informar o tempo estimado para download
        double tempo = tamanhoArquivoMB / velocidadeInternetMbps;

        System.out.println("Tempo estimado para download: " + tempo + " minutos");
    }
}
