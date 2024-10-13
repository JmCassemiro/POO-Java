import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto de arquivo
        Arquivo arquivo = new Arquivo();

        // Criando uma estrutura para entrada de dados
        Scanner sc = new Scanner(System.in);

        boolean executando = true;

        int contNy = 0;
        int contDg = 0;

        Livro livro = new Livro();

        while (executando) {
            System.out.println("+++ BEM-VINDO AO MENU DE CADASTRO DE LIVROS +++");
            System.out.println("1. Cadastar Livros");
            System.out.println("2. Listar Livros");
            System.out.println("3. Listar veículos em ordem crescente de preço");
            System.out.println("4. Porcentagem de livro de cada editora");
            System.out.println("5. Sair");
            int op = sc.nextInt();
            sc.nextLine();
            ArrayList<Livro> livros = arquivo.ler();
            // Menu
            switch (op) {

                case 1:
                    // Coletando as informções do funcionário

                    System.out.println("Titulo: ");
                    livro.setTitulo(sc.nextLine());

                    try {
                        System.out.println("Preco: ");
                        livro.setPreco(sc.nextDouble());
                        if (livro.getPreco() <= 0) {
                            throw new DadoInvalidoException();
                        }
                    } catch (Exception e) {
                        break;
                    }

                    sc.nextLine();

                    System.out.println("Gênero Literário: ");
                    livro.setGenLiterario(sc.nextLine());

                    try {
                        System.out.println("Quantidade de Folhas: ");
                        livro.setQtdFolhas(sc.nextInt());
                        if (livro.getQtdFolhas() <= 0) {
                            throw new DadoInvalidoException();
                        }
                    } catch (Exception e) {
                        break;
                    }

                    sc.nextLine();

                    try {
                        System.out.println("Editora: ");
                        livro.setEditora(sc.nextLine());
                        if ((livro.getEditora().equalsIgnoreCase("NYBooks")
                                || livro.getEditora().equalsIgnoreCase("DGBooks")) == false) {
                            throw new DadoInvalidoException();
                        }
                    } catch (Exception e) {
                        break;
                    }

                    try {
                        System.out.println("Ano de Lançamento: ");
                        livro.setAnoLancamento(sc.nextInt());
                        if (livro.getAnoLancamento() < 2000 || livro.getAnoLancamento() > 2023) {
                            throw new DadoInvalidoException();
                        }
                    } catch (Exception e) {
                        break;
                    }

                    if (livro.getEditora().equalsIgnoreCase("NYBooks")) {

                        contNy++;

                    }

                    if (livro.getEditora().equalsIgnoreCase("DGBooks")) {

                        contDg++;

                    }

                    // Escrevendo funcionário no arquivo
                    arquivo.escrever(livro);
                    break;
                case 2:
                    // Executar o método de leitura

                    System.out.println("INFORMAÇÕES DOS VEÍCULOS");
                    for (int i = 0; i < livros.size(); i++) {
                        System.out.println("Marca: " + livros.get(i).getTitulo());
                        System.out.println("Modelo: " + livros.get(i).getPreco());
                        System.out.println("Ano: " + livros.get(i).getGenLiterario());
                        System.out.println("Cilindradas: " + livros.get(i).getQtdFolhas());
                        System.out.println("Potencia: " + livros.get(i).getEditora());
                        System.out.println("Potencia: " + livros.get(i).getAnoLancamento());

                    }
                    break;
                case 3:
                    // Executar o método de leitura em ordem crescente
                    Collections.sort(livros);

                    System.out.println("INFORMAÇÕES DOS VEÍCULOS EM ORDEM CRESCENTE DE PREÇO");
                    for (int i = 0; i < livros.size(); i++) {
                        System.out.println("Marca: " + livros.get(i).getTitulo());
                        System.out.println("Modelo: " + livros.get(i).getPreco());
                        System.out.println("Ano: " + livros.get(i).getGenLiterario());
                        System.out.println("Cilindradas: " + livros.get(i).getQtdFolhas());
                        System.out.println("Potencia: " + livros.get(i).getEditora());
                        System.out.println("Potencia: " + livros.get(i).getAnoLancamento());

                    }
                    break;
                case 4:

                    System.out.println("Quantidade de livros NYBooks");
                    System.out.println(contNy);

                    System.out.println("Quantidade de livros DGBooks");
                    System.out.println(contDg);

                    break;

                case 5:
                    executando = false;
                    break;

                default:
                    System.out.println("Entrada errada...");
                    break;
            }
        }

        sc.close();

    }
}
