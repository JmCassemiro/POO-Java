public class Produto {

    // Atributos

    int codigoSerie; // Codigo série do produto

    String nome; // Nome do produto

    String categoria; // Categoria do produto

    int quantidade; // Quantidade do produto

    double valor; // Preço do produto

    // Métodos

    public void mostrarInfos() {

        System.out.println("Código série do Produto: " + codigoSerie);

        System.out.println("Nome do Produto: " + nome);

        System.out.println("Categoria do Produto: " + categoria);

        System.out.println("Quantidade do Produto: " + quantidade);

        System.out.println("Valor do Produto: " + valor);

    }

}