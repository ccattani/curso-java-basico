public class Erro3 {
    // Erro de sintaxe, o método main deve ser declarado com a assinatura correta, de forma minuscula e com o tipo de retorno void
    // O método Main declarado com letra maiúscula e sem o tipo de retorno void não é reconhecido como o ponto de entrada do programa, resultando em um erro de execução
    public static void main(String[] args) {
        // System.err.println("Você digitou: " + 1/0);  Erro de execução, divisão por zero não é permitida
        System.out.println("Hello World!");
    }
}
