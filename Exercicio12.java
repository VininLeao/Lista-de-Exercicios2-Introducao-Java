import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        int tanquesCheios = 0, quilometrosRodados = 0, litrosUtilizados = 0, quilometrosTotal = 0, litrosTotal = 0;
        double quilometrosLitro = 0, mediaQuilometrosLitro = 0, mediaQuilometrosRodados = 0;

        System.out.println("Para encerrar o programa, digite uma quantidade de quilômetros rodados negativa");

        while (quilometrosRodados >= 0) {
            System.out.println("Digite a quantidade de quilômetros rodados no tanque " + (tanquesCheios + 1));
            quilometrosRodados = scanner.nextInt();

            if (quilometrosRodados < 0) {
                System.out.println("O programa foi encerrado, mostrando o resultado: \n");
                break;
            }

            System.out.println("Digite a quantidade de litros utilizados com o tanque cheio:");
            litrosUtilizados = scanner.nextInt();

            quilometrosTotal += quilometrosRodados;
            litrosTotal += litrosUtilizados;
            quilometrosLitro = (double) quilometrosRodados / litrosUtilizados;
            tanquesCheios++;

            System.out.println("\nO consumo em quilômetros por litro de combústivel no tanque " + (tanquesCheios) + " foi de: " + df.format(quilometrosLitro) + " km/l");
            System.out.println("A quantidade de quilometragem combinada até agora é de: " + quilometrosTotal + " km");
            System.out.println("A quantidade de litros de combustível utilizados até agora é de: " + litrosTotal + " litros\n");
        }

        mediaQuilometrosLitro = (double) quilometrosTotal / litrosTotal;
        mediaQuilometrosRodados = (double) quilometrosTotal / tanquesCheios;

        System.out.println("Total de quilômetros combinados: " + quilometrosTotal + " km");
        System.out.println("Total de litros utilizados: " + litrosTotal + " litros");
        System.out.println("Média de quilômetros rodados: " + df.format(mediaQuilometrosRodados) + " km");
        System.out.println("Média de consumo de combustivel em quilômetros por litro de todos os tanques: " + df.format(mediaQuilometrosLitro) + " km/l");
    }
}