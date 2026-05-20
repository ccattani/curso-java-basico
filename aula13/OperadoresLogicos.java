public class OperadoresLogicos {
    public static void main(String[] args) {
        int valor1 = 1;
        int valor2 = 2;

        boolean resultado1 = (valor1 == valor2) && (valor1 < valor2);
        System.out.println("Resultado 1: " + resultado1);

        boolean resultado2 = (valor1 == valor2) || (valor1 < valor2);
        System.out.println("Resultado 2: " + resultado2);

        boolean resultado3 = !(valor1 == valor2);
        System.out.println("Resultado 3: " + resultado3);
    }
}
