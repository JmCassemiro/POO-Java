import java.util.Scanner;

public class Exercício1 {

    public static void main(String[] args) {

        int op; // Opção na função switch

        int x; // 1 Número a ser inserido

        int y; // 2 Número a ser inserido

        Scanner Entrada = new Scanner(System.in);

        System.out.print(
                "Digite a operação que deseja fazer: 1 (soma), 2(multiplicação), 3(divisão), 4(subtração), 5(exponencial): ");

        op = Entrada.nextInt();

        System.out.print("Entre com o primeiro numero: ");

        x = Entrada.nextInt();

        System.out.print("Entre com o segundo numero: ");

        y = Entrada.nextInt();

        switch (op) {

            case 1:

                System.out.println(x + y);

                break;

            case 2:

                System.out.println(x * y);

                break;

            case 3:

                System.out.println(x / y);

                break;

            case 4:

                System.out.println(x - y);

                break;

            case 5:

                System.out.println(Math.pow(x, y));

                break;

            case 6:

                System.out.println(Math.pow(y, x));

                break;

            default:

                System.out.println("Numero incorreto de alunos");

                break;

        }

        Entrada.close();

    }

}