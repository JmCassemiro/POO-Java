public class Autor {
    // Atributos

    String nome; // Nome do autor

    String profissao;// Profissão do Autor

    int anoNascimento; // Ano de nascimento do autor

    // Métodos da classe
    void mostrarInfos() {
        System.out.println("==== INFOS DO AUTOR ====");
        System.out.println("Nome: " + nome);
        System.out.println("Profissão: " + profissao);
        System.out.println("Ano de nascimento: " + anoNascimento);
    }
}