import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        int tanquesCheios = 0;
        int quilometrosTotal = 0;
        int litrosTotal = 0;
        double quilometrosLitro;
        double mediaQuilometrosLitro;
        double mediaQuilometrosRodados = 0;

        System.out.println("Para encerrar o programa, digite uma quantidade de quilômetros rodados negativa.");

        while (true) {
            System.out.println("Digite a quantidade de quilômetros rodados no tanque " + (tanquesCheios + 1) + ":");
            int quilometrosRodados = scanner.nextInt();

            if (quilometrosRodados < 0) {
                System.out.println("O programa foi encerrado, mostrando o resultado:\n");
                break;
            }

            System.out.println("Digite a quantidade de litros utilizados com o tanque cheio:");
            int litrosUtilizados = scanner.nextInt();

            quilometrosTotal += quilometrosRodados;
            litrosTotal += litrosUtilizados;

            quilometrosLitro = (double) quilometrosRodados / litrosUtilizados;
            tanquesCheios++;

            System.out.println("\nO consumo em quilômetros por litro de combustível no tanque " + tanquesCheios + " foi de: " + df.format(quilometrosLitro) + " km/l");
            System.out.println("A quantidade de quilometragem combinada até agora é de: " + quilometrosTotal + " km");
            System.out.println("A quantidade de litros de combustível utilizados até agora é de: " + litrosTotal + " litros\n");
        }

        if (tanquesCheios > 0) {
            mediaQuilometrosLitro = (double) quilometrosTotal / litrosTotal;
            mediaQuilometrosRodados = (double) quilometrosTotal / tanquesCheios;

            System.out.println("Total de quilômetros combinados: " + quilometrosTotal + " km");
            System.out.println("Total de litros utilizados: " + litrosTotal + " litros");
            System.out.println("Média de quilômetros rodados por tanque: " + df.format(mediaQuilometrosRodados) + " km");
            System.out.println("Média de consumo de combustível em quilômetros por litro de todos os tanques: " + df.format(mediaQuilometrosLitro) + " km/l");
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }
    }
}
