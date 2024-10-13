public class Aldeia {

    // Atributos

    private String nome;

    private String paisLocalizacao;

    private String lider;

    // Criando um array de ninjas

    private Ninja[] ninjas = new Ninja[10];

    // Metodos

    public void registrarNinja(Ninja ninja) {

        for (int i = 0; i < ninjas.length; i++) {

            if (ninjas[i] == null) {

                ninjas[i] = ninja;
                break;

            }

        }

    }

    public void listarNinjas() {

        for (int i = 0; i < ninjas.length; i++) {

            if (ninjas[i] != null) {

                if (ninjas[i] instanceof Gennin) {

                    Gennin auxGennin = (Gennin) ninjas[i];

                    auxGennin.mostrarInfo();
                    auxGennin.treinarJutsu();
                    auxGennin.realizarMissao();
                    auxGennin.treinarParaExame();
                    auxGennin.atacar();
                    auxGennin.lutar();

                }

                else {

                    Jonnin auxJonnin = (Jonnin) ninjas[i];

                    auxJonnin.mostrarInfo();
                    auxJonnin.treinarJutsu();
                    auxJonnin.liderarTime();
                    auxJonnin.lutar();
                    auxJonnin.atacar();

                }

            }

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisLocalizacao() {
        return paisLocalizacao;
    }

    public void setPaisLocalizacao(String paisLocalizacao) {
        this.paisLocalizacao = paisLocalizacao;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

}