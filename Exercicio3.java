import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int a = scanner.nextInt();

        System.out.println("Os números primos menores que ele são: ");

        for (int i = 1; i < a; i++) {
            int contDiv = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    contDiv++;
                }
            }
            if (contDiv == 2) {
                System.out.println(i);
            }
        }
    }
}


