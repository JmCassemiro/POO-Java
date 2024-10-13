import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int lanche1, lanche2, lanche3;

        System.out.print("Digite a quantidade do lanche 1: ");

        lanche1 = entrada.nextInt();

        System.out.print("Digite a quantidade do lanche 2: ");

        lanche2 = entrada.nextInt();

        System.out.print("Digite a quantidade do lanche 3: ");

        lanche3 = entrada.nextInt();

        entrada.close();

        int total = lanche1 + lanche2 + lanche3;

        int media = total / 3;

        System.out.println("Total de lanches: " + total);

        System.out.println("Media de lanches: " + media);

    }
}
