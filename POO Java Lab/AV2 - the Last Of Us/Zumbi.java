public class Zumbi extends Personagem implements Lutar, Infectar {

    private int diasInfeccao;
    private boolean cego;

    // Métodos

    public void mostrarInfos() {
        System.out.println("Dias de infecção: " + this.diasInfeccao);
        System.out.println("Cego: " + this.cego);
        super.mostrarInfos();

    }

    public void transformacao() {
        if (diasInfeccao >= 2 && diasInfeccao < 14) {
            System.out.println("Este zumbi é um corredor!!!");
            cego = false;
        } else if (diasInfeccao >= 14 && diasInfeccao < 365) {
            System.out.println("Este zumbi é um perseguidor!!!");
            cego = false;
        } else {
            System.out.println("Este zumbi é um estalador!!!");
            cego = true;
        }
    }

    // Getters e setters

    public void setDiasInfeccao(int diasInfeccao) {
        this.diasInfeccao = diasInfeccao;
    }

    public int getDiasInfeccao() {
        return diasInfeccao;
    }

    // Interfaces
    @Override
    public void infectou() {
        System.out.println("zumbi mordeu e infectou um Humano.");
    }

    @Override
    public void atacar() {
        System.out.println("Zumbi atacou o humano");
    }

    @Override
    public void defender() {
        System.out.println("O zumbi defendeu do ataque do humano");
    }
}
