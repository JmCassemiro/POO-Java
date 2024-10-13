import java.util.Scanner;

public class Exercício2 {

    public static void main(String[] args) {

        int np1;

        int np2;

        float media;

        Scanner Entrada = new Scanner(System.in);

        System.out.print("Entre com a np1: ");

        np1 = Entrada.nextInt();

        System.out.print("Entre com a np2: ");

        np2 = Entrada.nextInt();

        media = (np1 + np2) / 2;

        System.out.println(media);

        Entrada.close();

    }

}
