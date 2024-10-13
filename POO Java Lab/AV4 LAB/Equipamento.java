public class Equipamento {

    // Atributos

    int numSerie; // Numero de serie da academia

    String nome; // Nome do equipamento

    String marca; // Marca do equipamento

    double valorAquisicao; // Valor do equipamento

    String status; // Se está ou nao em manutencao

    // Metodos

    void mostrarInfos() {

        System.out.println("Numero de serie do equipamento: " + numSerie);
        System.out.println("Nome do equipamento: " + nome);
        System.out.println("Marca do equipamento: " + marca);
        System.out.println("Valor do equipamento: " + valorAquisicao);
        System.out.println("Status do equipamento:" + status);
    }

}