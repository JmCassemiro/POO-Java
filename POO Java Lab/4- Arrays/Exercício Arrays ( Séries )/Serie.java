public class Serie {

    // Atributos

    String nome; // Nome da serie

    double nota; // Nota da serie

    int temporadas; // Nota da temporada

    boolean finalizada; // Variavel booleana pra ver se a serie ja foi finalizada

    Diretor diretor; // Atribuindo diretor a serie

    // Construtor de diretores

    public Serie() {

        diretor = new Diretor();

        System.out.println("Novo diretor para a serie adicionado!");

    }

    // Metodos

    void mostrarInfo() {

        System.out.println("Nome da serie: " + nome);
        System.out.println("Nota da serie: " + nota);
        System.out.println("Nome da serie: " + temporadas);
        System.out.println("Nome do diretor da serie: " + diretor.nome);

    }

}
