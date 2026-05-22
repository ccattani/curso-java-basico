import java.util.Scanner;

// 25. Faça um Programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
    // a. "Telefonou para a vítima?"
    // b. "Esteve no local do crime?"
    // c. "Mora perto da vítima?"
    // d. "Devia para a vítima?"
    // e. "Já trabalhou com a vítima?"
    // O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".
public class Ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda 5 perguntas com S para sim e N para não.");
        System.out.print("Telefonou para a vítima? ");
        String resposta1 = scanner.nextLine().toUpperCase();
        System.out.print("Esteve no local do crime? ");
        String resposta2 = scanner.nextLine().toUpperCase();
        System.out.print("Mora perto da vítima? ");
        String resposta3 = scanner.nextLine().toUpperCase();
        System.out.print("Devia para a vítima? ");
        String resposta4 = scanner.nextLine().toUpperCase();
        System.out.print("Já trabalhou com a vítima? ");
        String resposta5 = scanner.nextLine().toUpperCase();

        int respostasSim = 0;
        if (resposta1.equals("S")) respostasSim++;
        if (resposta2.equals("S")) respostasSim++;
        if (resposta3.equals("S")) respostasSim++;
        if (resposta4.equals("S")) respostasSim++;
        if (resposta5.equals("S")) respostasSim++;

        if (respostasSim == 5) {
            System.out.println("Assassino");
        } else if (respostasSim >= 3) {
            System.out.println("Cúmplice");
        } else if (respostasSim == 2) {
            System.out.println("Suspeito");
        } else {
            System.out.println("Inocente");
        }
    }
}
