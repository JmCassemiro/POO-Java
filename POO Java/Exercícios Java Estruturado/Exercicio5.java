import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();

        int numGerado, numAdivinhado;

        numGerado = rand.nextInt(10) + 1;

        System.out.print("Entre com o numero para adivinhar: ");

        do {

            numAdivinhado = entrada.nextInt();

            if (numAdivinhado != numGerado)
                System.out.print("Numero errado, tente novamente: ");

        } while (numAdivinhado != numGerado);

        System.out.println("Boa, acertou!");

        entrada.close();

    }

}
