
public class Ex9 {

    public static void main(String[] args) {
        System.out.println("Impriva apenas os números impares de 1 a 50");

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
