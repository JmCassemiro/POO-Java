import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Entrada de dados

        Scanner sc = new Scanner(System.in);

        // Criando objetos da plataforma

        Plataforma plataforma = new Plataforma();

        plataforma.nome = "Jm Series";

        // Menu

        boolean controle = true;

        while (controle) {

            System.out.println("Bem vindo a plataforma do JM");

            System.out.println("1- Adicionar series");

            System.out.println("2- Mostrar informações da plataforma e suas series");

            System.out.println("3- Mostrar serie com mais temporadas que ja foi finalizada");

            System.out.println(
                    "4- Mostrar a porcentagem do numero de series e a media de notas que possuem 3 ou mais temp");

            System.out.println("5- Sair");

            int op = sc.nextInt();

            switch (op) {

                case 1:
                    Serie novaSerie = new Serie();

                    System.out.println("** Adicionando series **");
                    System.out.print("Nome: ");
                    sc.nextLine();
                    novaSerie.nome = sc.nextLine();

                    System.out.print("Diretor: ");
                    novaSerie.diretor.nome = sc.nextLine();

                    System.out.print("Nota: ");
                    novaSerie.nota = sc.nextInt();

                    System.out.print("Temporadas: ");
                    novaSerie.temporadas = sc.nextInt();

                    System.out.print("Finalizada? : 1. SIM  //  2.NAO ");
                    int op2 = sc.nextInt();

                    if (op2 == 1) {

                        novaSerie.finalizada = true;

                    }

                    else if (op == 2) {

                        novaSerie.finalizada = false;

                    }

                    plataforma.addSerie(novaSerie);
                    break;

                case 2:
                    plataforma.mostraInfo();
                    break;

                case 3:

                    System.out.println(plataforma.serieMaisLongaFinalizada());
                    break;

                case 4:

                    plataforma.mediaPorcentagem();
                    break;

                case 5:

                    controle = false;
                    break;

                default:

                    System.out.println("Opção inválida");
                    break;

            }
        }

        sc.close();

    }

}