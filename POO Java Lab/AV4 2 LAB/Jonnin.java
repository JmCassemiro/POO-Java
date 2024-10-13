public class Jonnin extends Ninja implements Batalhar, Lideranca {

    // Atributos

    private String habilidadeEspecial;

    // Metodos

    public void treinarJutsu() {

    }

    public void mostrarInfo() {

        System.out.println("== Informações do Jonnin ==");

        super.mostrarInfo();

        System.out.println("Cor: " + this.habilidadeEspecial);

    }

    // Método implementado a partir da interface

    @Override
    public void atacar() {

        if (habilidadeEspecial.equalsIgnoreCase("Clones")) {

            double chakra = this.getChakra();

            chakra = chakra - (chakra * 0.05d);

            this.setChakra(chakra);

            System.out.println("Seu chakra atual: " + this.getChakra());

            System.out.println("Nome do Ninja: " + this.getNome());

        }

        else if (habilidadeEspecial.equalsIgnoreCase("Teletransporte")) {

            double chakra = this.getChakra();

            chakra = chakra - (chakra * 0.07d);

            this.setChakra(chakra);

            System.out.println("Seu chakra atual: " + this.getChakra());

            System.out.println("Nome do Ninja: " + this.getNome());
        }

    }

    @Override
    public void lutar() {

        System.out.println("Está acontecendo uma batalha");

        this.mostrarInfo();

    }

    @Override
    public void liderarTime() {

        System.out.println("Liderando o Time!");

    }

    // Getters and Setters

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }

}
