public class AnoVeiculoException extends Exception {
    public AnoVeiculoException() {
        System.out.println("Não é permitido cadastrar veículos com ano nulo ou menor que zero.");
    }
}
