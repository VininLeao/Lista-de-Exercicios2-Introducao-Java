import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira palavra:");
        String palavra = scanner.nextLine();
        System.out.println("Digite a segunda palavra:");
        String palavra2 = scanner.nextLine();

        System.out.println("As palavras organizadas em ordem alfabética:");
        if (palavra.compareToIgnoreCase(palavra2) < 0) {
            System.out.println(palavra);
            System.out.println(palavra2);
        } else if (palavra.compareToIgnoreCase(palavra2) > 0) {
            System.out.println(palavra2);
            System.out.println(palavra);
        } else {
            System.out.println("As palavras são iguais");
        }

        if (palavra.length() > palavra2.length()) {
            System.out.println(palavra + " tem o maior número de caracteres");
        } else if (palavra.length() < palavra2.length()) {
            System.out.println(palavra2 + " tem o maior número de caracteres");
        } else {
            System.out.println("As palavras tem o mesmo número de caracteres");
        }
    }
}