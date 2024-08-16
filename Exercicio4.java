import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma distância em milhas para ser convertida para quilômetros:");
        double distMilhas = scanner.nextDouble();

        double distKm = distMilhas * 1.609;

        System.out.println("A distância apresentada em milhas convertida para quilômetros é: " +distKm+ " quilômetros");

    }
}