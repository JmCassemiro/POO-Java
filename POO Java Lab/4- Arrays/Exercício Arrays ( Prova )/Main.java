import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Entrada de dados

        Scanner sc = new Scanner(System.in);

        // Criando o objeto da escola

        Escola escola = new Escola();

        escola.nome = "Inatel";

        escola.endereco = "Rua da inatel";

        escola.telefone = 255;

        escola.email = "Inatel@outlook.com";

        // Criando o menu

        boolean controle = true;

        while (controle) {

            System.out.println("Bem vindo ao sistema de cadastro");

            System.out.println("1- Adicionar alunos");

            System.out.println("2- Mostrar informações");

            System.out.println("3- Mostrar quantidade de alunos");

            System.out.println("4- Sair");

            int op = sc.nextInt();

            sc.nextLine();

            switch (op) {

                case 1:

                    Estudante aluno = new Estudante();

                    System.out.println("Nome do aluno: ");

                    aluno.nome = sc.nextLine();

                    System.out.println("Idade do aluno: ");

                    aluno.idade = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Ano letivo: ");

                    aluno.ano = sc.nextLine();

                    // Adicionando aluno na escola

                    escola.addEstudante(aluno);

                    break;

                case 2:

                    escola.mostrarInfo();

                    break;

                case 3:

                    escola.qtdEstudantesPorAno();

                    break;

                case 4:

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
