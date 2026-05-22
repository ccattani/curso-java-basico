public class LoopWhile {
    public static void main(String[] args) {
        int i = 1; // count ou cont
        int max = 10;

        System.out.println("Contando até " + max);

        while(i <= max){
            System.out.println(i);
            i++; // i = i + 1; // i += 1;
        }

        System.out.println("Fim do loop");

        do {
            i++;
            System.out.println("Valor de i: " + i);
        } while( i < 15);

        System.out.println("Fim do segundo loop: " + i);
    }
}