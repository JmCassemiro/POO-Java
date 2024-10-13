import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        int alunos;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de alunos matriculados: ");

        alunos = entrada.nextInt();

        switch (alunos) {

            case 10:

                System.out.println("Sala 16");
                break;

            case 20:

                System.out.println("Sala 16");
                break;

            case 30:

                System.out.println("Sala 22");
                break;

            default:

                System.out.println("Numero incorreto de alunos");
                break;

        }

        entrada.close();

    }

}
