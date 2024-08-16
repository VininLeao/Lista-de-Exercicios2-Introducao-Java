import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do círculo para calcular sua área:");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);


        System.out.println("A área do circulo é de: " +Math.round(area));


    }
}