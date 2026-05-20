public class CurtoCircuito {
    public static void main(String[] args) {
        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso & verdadeiro; // Avalia ambos os operandos
        boolean resultado2 = falso && verdadeiro; // Não avalia o segundo operando e por isso que utilizamos o & curto circuito.
        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
    }
}
