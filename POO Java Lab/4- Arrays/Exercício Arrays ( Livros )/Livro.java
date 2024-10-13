public class Livro {
    // Atributos do livro

    String genLiterario; // Genero literário do livro

    String editora;// Editora do livro

    String titulo;// Titulo do livro

    int qtdFolhas;// Quantidade de folhas do livro

    Autor autor; // Atribuindo autor ao livro

    // Construtor da classe Livro
    public Livro() {
        autor = new Autor();
    }

    // Métodos
    void mostrarInfos() {
        System.out.println("==== Infos do livro ====");
        System.out.println("Titulo: " + titulo);
        System.out.println("Editora: " + editora);
        System.out.println("Gen. Literário: " + genLiterario);
        System.out.println("Quantidade de folhas: " + qtdFolhas);

        autor.mostrarInfos();
    }

}