public class Elfo extends Habitante implements Cura {

    // Atributos

    private String tribo;

    // Metodos

    public void viajar() {

        System.out.println("Viajando");

    }

    public void atacar() {

        System.out.println("Elfo atacou!");

        super.atacar();

    }

    public void mostraInfo() {

        System.out.println("== Informações do Elfo ==");

        super.mostraInfo();

        System.out.println("Tribo: " + this.tribo);

    }

    // Polimorfismo

    @Override
    public void curar() {

        float energia = this.getEnergia();

        energia = energia + (energia * 0.15f);

        this.setEnergia(energia);

        System.out.println("O heroi foi curado");

        System.out.println("Energia Atual: " + this.getEnergia());

    }

    // Setter da tribo do elfo

    public void setTribo(String tribo) {
        this.tribo = tribo;
    }

}
