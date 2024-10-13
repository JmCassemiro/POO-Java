import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Entrada de dados

        Scanner sc = new Scanner(System.in);

        // Criando Objetos do Supermercado

        Supermercado supermercado = new Supermercado();

        supermercado.nome = "Mercadinho da Dona Dora";

        supermercado.cnpj = "38.334.063/0001-57";

        supermercado.endereco = "Rua Da Inatel // Número 234";

        supermercado.numTelefone = "3274-2045";

        // Criando o Menu

        boolean controle = true;

        while (controle) {

            System.out.println("Bem vindo ao Supermercado");

            System.out.println("1- Adicionar produtos");

            System.out.println("2- Mostrar informações do Supermercado e seus produtos");

            System.out.println("3- Mostrar quantidade de produtos");

            System.out.println("4- Mostrar informações do produto mais caro e mais barato");

            System.out.println("5- Sair");

            int op = sc.nextInt();

            switch (op) {

                case 1:

                    Produto novoProduto = new Produto();

                    System.out.println("** Adicionando produtos **");
                    System.out.print("Nome: ");
                    sc.nextLine();
                    novoProduto.nome = sc.nextLine();

                    System.out.print("Código série: ");
                    novoProduto.codigoSerie = sc.nextInt();

                    System.out.print("Categoria: ");
                    sc.nextLine();
                    novoProduto.categoria = sc.nextLine();

                    System.out.print("Quantidade: ");
                    novoProduto.quantidade = sc.nextInt();

                    System.out.print("Valor: ");
                    novoProduto.valor = sc.nextInt();

                    supermercado.addProduto(novoProduto);
                    break;

                case 2:
                    supermercado.mostrarInfo();
                    break;

                case 3:
                    supermercado.contarCategorias();
                    break;

                case 4:
                    supermercado.mostrarMaisCaroBarato();
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