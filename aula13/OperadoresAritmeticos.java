public class OperadoresAritmeticos{
    public static void main(String[] arg){
        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNome = "Está é";
        String segundoNome = " uma string concatenada.";
        String nomeCompleto = primeiroNome + segundoNome;
        System.out.println(nomeCompleto);
    }
}