import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Entrada de dados

        Scanner sc = new Scanner(System.in);

        // Criando objetos da academia

        Academia academia = new Academia();

        academia.nome = "Academia do Jm";

        academia.numTelefone = "3241 - 4578";

        // Menu

        // Menu

        boolean controle = true;

        while (controle) {

            System.out.println("Bem vindo a academia do JM");

            System.out.println("1- Adicionar equipamentos");

            System.out.println("2- Mostrar informações da academia e seus equipamentos");

            System.out.println("3- Apresentara quantidadee a % de equipamentos da academia que estão em manutencao");

            System.out
                    .println("4- Apresentar todas as informacoes do equipamento com maiore menor custo para aquisicao");

            System.out.println("5- Sair");

            int op = sc.nextInt();

            switch (op) {

                case 1:
                    Equipamento novoEquipamento = new Equipamento();

                    System.out.println("** Adicionando Equipamentos **");
                    System.out.print("Nome: ");
                    sc.nextLine();
                    novoEquipamento.nome = sc.nextLine();

                    System.out.print("Numero de Serie: ");
                    novoEquipamento.numSerie = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Marca: ");
                    novoEquipamento.marca = sc.nextLine();

                    System.out.print("Valor: ");
                    novoEquipamento.valorAquisicao = sc.nextDouble();

                    sc.nextLine();

                    System.out.print("Status: ");
                    novoEquipamento.status = sc.nextLine();

                    academia.cadastrarEquipamento(novoEquipamento);
                    break;

                case 2:

                    academia.mostrarInfos();
                    break;

                case 3:

                    academia.infosEquipamentoManutencao();
                    break;

                case 4:

                    academia.mostrarMaisCaroBarato();
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