import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int np3, npa, media;

        System.out.print("Entre com o a nota NPA: ");

        npa = entrada.nextInt();

        if (npa >= 60) {

            System.out.println("Aprovado");

        } else {

            if (npa >= 30) {

                System.out.println("Ainda há chances. Rumo a np3");

                System.out.print("Entre com a nota da NP3: ");

                np3 = entrada.nextInt();

                media = (npa + np3) / 2;

                if (media >= 50) {

                    System.out.println("Aprovado");

                } else

                    System.out.println("Reprovado");
            }
        }

        entrada.close();

    }

}
