public class Mago extends Habitante implements Feitico, Cura {

    // Atributos

    private String cor;

    // Metodos

    public void atacar() {

        System.out.println("Mago atacou!");

        super.atacar();

    }

    public void mostraInfo() {

        System.out.println("== Informações do Mago ==");

        super.mostraInfo();

        System.out.println("Cor: " + this.cor);

    }

    @Override
    public void lancaFeitico() {

        float energia = this.getEnergia();

        energia = energia - (energia * 0.1f);

        this.setEnergia(energia);

        System.out.println("Lançando feitiço!");

        System.out.println("Sua energia atual: " + this.getEnergia());

    }

    @Override
    public void curar() {

        float energia = this.getEnergia();

        energia = energia + (energia * 0.15f);

        this.setEnergia(energia);

        System.out.println("O heroi foi curado");

        System.out.println("Energia Atual: " + this.getEnergia());

    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
