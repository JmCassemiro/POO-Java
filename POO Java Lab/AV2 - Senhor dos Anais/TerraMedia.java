public class TerraMedia {

    // Atributos

    private Habitante[] herois = new Habitante[10];

    // Metodos

    public void addHabitante(Habitante habitante) {

        for (int i = 0; i < herois.length; i++) {

            if (herois[i] == null) {

                herois[i] = habitante;
                break;

            }

        }

    }

    public void listarHabitantes() {

        for (int i = 0; i < herois.length; i++) {

            if (herois[i] != null) {

                if (herois[i] instanceof Anao) {

                    Anao auxAnao = (Anao) herois[i];

                    auxAnao.mostraInfo();
                    auxAnao.minerar();
                    auxAnao.atacar();

                }

                else if (herois[i] instanceof Elfo) {

                    Elfo auxElfo = (Elfo) herois[i];

                    auxElfo.mostraInfo();
                    auxElfo.curar();
                    auxElfo.atacar();
                    auxElfo.viajar();

                }

                else {

                    Mago auxMago = (Mago) herois[i];

                    auxMago.mostraInfo();
                    auxMago.lancaFeitico();
                    auxMago.atacar();
                    auxMago.curar();

                }

            }

        }

    }

}