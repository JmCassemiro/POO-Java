public class Livro implements Comparable<Livro> {

    // Atributos do veículo
    private String titulo;
    private double preco;
    private String genLiterario;
    private int qtdFolhas;
    private String editora;
    private int anoLancamento;

    // Construtor
    public Livro() {
    }

    @Override
    public int compareTo(Livro livro) {

        return Double.compare(this.preco, livro.preco);
    }

    // Getter e Setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getGenLiterario() {
        return genLiterario;
    }

    public void setGenLiterario(String genLiterario) {
        this.genLiterario = genLiterario;
    }

    public int getQtdFolhas() {
        return qtdFolhas;
    }

    public void setQtdFolhas(int qtdFolhas) {
        this.qtdFolhas = qtdFolhas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void mostrarInfo() {

        System.out.println("INFORMAÇÕES DOS LIVROS");

        System.out.println("Titulo: " + this.titulo);
        System.out.println("Preco: " + this.preco);
        System.out.println("Gênero Literário: " + this.genLiterario);
        System.out.println("Quantidade de Folhas: " + this.qtdFolhas);
        System.out.println("Editora: " + this.editora);
        System.out.println("Ano de Lançamento: " + this.anoLancamento);

    }

}