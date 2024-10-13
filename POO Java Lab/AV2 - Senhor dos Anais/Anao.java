
public class Anao extends Habitante implements Mineracao {

    // Atributos

    private float altura;

    private String reino;

    // Metodos

    public void atacar() {

        System.out.println("Anao Atacou!");

        super.atacar();

    }

    public void mostrarInfo() {

        System.out.println("== Informações do Anao ==");

        super.mostraInfo();

        System.out.println("Altura: " + this.altura);

        System.out.println("Reino: " + this.reino);

    }

    @Override
    public void minerar() {

        System.out.println("Mineirando!");

    }

    // Setter do anao

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

}
