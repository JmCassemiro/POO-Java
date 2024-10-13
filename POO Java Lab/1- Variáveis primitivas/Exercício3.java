import java.util.Scanner;

public class Exercício3 {

    public static void main(String[] args) {

        int litros;

        Scanner Entrada = new Scanner(System.in);

        char op = Entrada.next().charAt(0);

        litros = Entrada.nextInt();

        double d1;

        double d2;

        double d3;

        double d4;

        switch (op) {

            case 'g':

                if (litros <= 20) {

                    d1 = litros * 6.00 * 0.04;
                    System.out.println((litros * 6) - d1);
                }

                else {

                    d2 = litros * 6.00 * 0.06;
                    System.out.println((litros * 6) - d2);

                }
                break;

            case 'a':

                if (litros <= 20) {

                    d3 = litros * 4.90 * 0.03;
                    System.out.println((litros * 4.90) - d3);
                }

                else {
                    d4 = litros * 4.90 * 0.05;
                    System.out.println((litros * 4.90) - d4);

                }

                break;

            default:
                System.out.println("Letra invalida");

                break;
        }
        Entrada.close();

    }

}
