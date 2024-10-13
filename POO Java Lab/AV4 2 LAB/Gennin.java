public class Gennin extends Ninja implements Treinamento, Batalhar {

    // Atributos

    private String nomeSensei;

    // Metodos

    public void realizarMissao() {

        System.out.println(this.getNome() + "Está Realizando Missão");

    }

    public void treinarJutsu() {

        // N deu tempo

    }

    public void mostrarInfo() {

        System.out.println("== Informações do Gennin ==");

        super.mostrarInfo();

        System.out.println("Cor: " + this.nomeSensei);

    }

    // Método implementado a partir da interface

    @Override
    public void atacar() {

        System.out.println("Ataque fraco, sem chakra utilizado");

        System.out.println("Seu chakra atual: " + this.getChakra());

        System.out.println("Nome do Ninja: " + this.getNome());

    }

    @Override
    public void lutar() {

        System.out.println("Está acontecendo uma batalha");

        this.mostrarInfo();

    }

    @Override
    public void treinarParaExame() {

        if (nomeSensei.equalsIgnoreCase("Kakashi")) {

            double poder = this.getPoder();

            poder = poder + 10;

            this.setPoder(poder);

        }

    }

    // Getters and Setters

    public String getNomeSensei() {
        return nomeSensei;
    }

    public void setNomeSensei(String nomeSensei) {
        this.nomeSensei = nomeSensei;
    }

}
