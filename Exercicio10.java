import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma cadeia de caracteres:");
        String palavra = scanner.nextLine();
        palavra = palavra.toLowerCase();

        int contVog = 0, contCons = 0, contEspaco = 0;

        for (int i = 0; i < palavra.length(); i++) {

            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i'
                    || palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u') {
                contVog++;
            }
            else if (palavra.charAt(i) >= 'a' && palavra.charAt(i) <= 'z') {
                contCons++;
            } else if (palavra.charAt(i) == ' ') {
                contEspaco++;
            }
        }
        System.out.println("A quantidade de vogais na cadeia de caracteres é de: " +contVog);
        System.out.println("A quantidade de consoantes na cadeia de caracteres é de: " +contCons);
        System.out.println("A quantidade de espaço em branco na cadeia de caracteres é de: " +contEspaco);
    }
}