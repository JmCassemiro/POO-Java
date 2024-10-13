public class Jutsu {

    // Atributos

    private String tipo;

    private char rankJutsu;

    // Metodos

    public void mostrarInfo() {

        System.out.println("Tipo:" + this.tipo);

        System.out.println("RankJutsu: " + this.rankJutsu);

    }

    // Getter and Setter

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public char getRankJutsu() {
        return rankJutsu;
    }

    public void setRankJutsu(char rankJutsu) {
        this.rankJutsu = rankJutsu;
    }

}
