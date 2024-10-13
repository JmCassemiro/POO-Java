public abstract class Personagem {
    private static int numPersonagem = 0;

    private int vida;
    private int idPersonagem;

    // Construtor de contador de personagens

    public Personagem() {
        numPersonagem++;
        idPersonagem = numPersonagem;
    }

    // Metodos
    public void mostrarInfos() {
        System.out.println("Vida: " + this.vida);
        System.out.println("ID: " + this.idPersonagem);
        System.out.println("--------------------");
    }

    // Getter e setters
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

}
