public class Arma {
    private int forca;
    private String tipoArma;


    //Getters e Setters
    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }


    //Métodos
    public void mostrarInfos() {
        System.out.println("Tipo: " + this.tipoArma);
        System.out.println("Força: " + this.forca);
    }
}
