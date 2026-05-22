import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double populacaoA = 80000;
        double populacaoB = 200000;
        double taxaCrescimentoA = 0.03;
        double taxaCrescimentoB = 0.015;

        int anos = 0;
        while (populacaoA < populacaoB){
            populacaoA += populacaoA * taxaCrescimentoA;
            populacaoB += populacaoB * taxaCrescimentoB;
            anos++;
        }

        System.out.println("São necessários " + anos + " anos para que a população do país A ultrapasse ou iguale ao país B.");
    }
}
