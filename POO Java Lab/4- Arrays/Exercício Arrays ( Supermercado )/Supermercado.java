public class Supermercado {

    // Atributos

    String nome; // Nome do Supermercado

    String cnpj; // CNPJ do Supermercado

    String endereco; // Endereco do Supermercado

    String numTelefone; // Numero de telefone do Supermercado

    Produto[] produtos = new Produto[30];

    // Metodos

    void addProduto(Produto p) {

        for (int i = 0; i < produtos.length; i++) {

            if (produtos[i] == null) {

                produtos[i] = p;

                break;
            }

        }

    }

    public void mostrarMaisCaroBarato() {

        double maior = 0;

        double menor = 999999999;

        int posMaior = 0;

        int posMenor = 0;

        for (int i = 0; i < produtos.length; i++) {

            if (produtos[i] != null) {

                if (produtos[i].valor > maior) {

                    maior = produtos[i].valor;
                    posMaior = i;

                }

                else if (produtos[i].valor < menor) {

                    menor = produtos[i].valor;
                    posMenor = i;

                }

            }

        }

        System.out.println("Produto com maior valor: " + produtos[posMaior].nome);
        System.out.println("Valor R$: " + maior);

        System.out.println("Produto com menor valor: " + produtos[posMenor].nome);
        System.out.println("Valor R$: " + menor);

    }

    public void contarCategorias() {

        int contH = 0;

        int contA = 0;

        int contU = 0;

        for (int i = 0; i < produtos.length; i++) {

            if (produtos[i] != null) {

                if (produtos[i].categoria.equalsIgnoreCase("Higiene")) {
                    contH++;
                }

                else if (produtos[i].categoria.equalsIgnoreCase("Alimentício")) {
                    contA++;

                }

                else if (produtos[i].categoria.equalsIgnoreCase("Utensílios")) {
                    contU++;
                }

            }

        }

        System.out.println("****** Quantidade de produtos de cada categoria ******");
        System.out.println("Quantidade de produtos de Higiene: " + contH);
        System.out.println("Quantidade de produtos de Alimentos: " + contA);
        System.out.println("Quantidade de produtos de Utensílios: " + contU);

    }

    public void mostrarInfo() {

        System.out.println("\n****** INFORMAÇÕES DO SUPERMERCADO ******");

        System.out.println("Nome do Supermercado: " + nome);

        System.out.println("CNPJ do Supermercado: " + cnpj);

        System.out.println("Endereço do Supermercado: " + endereco);

        System.out.println("Número de telefone do Supermercado: " + numTelefone);

        System.out.println("****** INFORMAÇÕES DO PRODUTO ******");

        for (int i = 0; i < produtos.length; i++) {

            if (produtos[i] != null) {

                produtos[i].mostrarInfos();

            }

        }

    }

}
