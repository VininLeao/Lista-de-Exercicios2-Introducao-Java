import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine().replaceAll(" ", "");
        String palavraContrario = new StringBuilder(palavra.toLowerCase()).reverse().toString();

        if (palavra.equalsIgnoreCase(palavraContrario)) {
            System.out.println("A palavra " + palavra + " pode ser lida da mesma forma da esquerda para a direita e vice-versa.");
        } else {
            System.out.println("A palavra " + palavra + " não pode ser lida da mesma forma da esquerda para a direita e vice-versa.");
        }
    }
}