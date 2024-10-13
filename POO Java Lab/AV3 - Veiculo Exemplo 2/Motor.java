public class Motor {

    private double potencia;

    private int numCilindros;

    public Motor(double potencia, int numCilindros) {
        this.potencia = potencia;
        this.numCilindros = numCilindros;
    }

    // Getters e Setters

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getNumCilindros() {
        return numCilindros;
    }

    public void setNumCilindros(int numCilindros) {
        this.numCilindros = numCilindros;
    }

}
