import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7:");
        int dia = scanner.nextInt();

        String[] diasSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

        System.out.println(diasSemana[dia - 1]);

    }
}