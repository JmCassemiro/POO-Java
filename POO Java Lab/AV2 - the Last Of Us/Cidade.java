public class Cidade {
    private String nome;
    private Personagem[] personagens = new Personagem[10];

    // SETTER DA CIDADE

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarPersonagens(Personagem personagem) {
        for (int i = 0; i < personagens.length; i++) {
            if (personagens[i] == null) {
                personagens[i] = personagem;
                break;
            }
        }
    }

    public void listarPersonagens() {
        for (int i = 0; i < personagens.length; i++) {
            if (personagens[i] != null) {
                if (personagens[i] instanceof Humano) {
                    Humano auxHumano = (Humano) personagens[i];
                    auxHumano.modificarArma();
                    System.out.print("\n");
                    auxHumano.atacar();
                    System.out.print("\n");
                    auxHumano.defender();
                    System.out.print("\n");
                    auxHumano.mostrarInfos();
                    System.out.print("\n");
                } else if (personagens[i] instanceof Zumbi) {
                    Zumbi auxZumbi = (Zumbi) personagens[i];
                    auxZumbi.transformacao();
                    auxZumbi.atacar();
                    auxZumbi.defender();
                    auxZumbi.infectou();
                    System.out.print("\n");
                    auxZumbi.mostrarInfos();
                    System.out.print("\n");
                }
            }
        }
    }
}
