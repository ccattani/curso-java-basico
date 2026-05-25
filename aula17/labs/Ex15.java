
import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o n-ésimo termo da série de fibonacci: ");
        int n = scanner.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.println(primeiro);
        System.out.println(segundo);

        //1,1,2,3,5
        //primeiro = 1
        //segundo = 2
        //proximo = 3
        for (int i = 3; i <= n; i++) {

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);
        }
    }
}
