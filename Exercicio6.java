public class Exercicio6 {
    public static void main(String[] args) {

        int produto = 1;

        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) {
                produto *= i;
            }
        }

        System.out.println(produto);
        System.out.println((float) produto);

    }
}