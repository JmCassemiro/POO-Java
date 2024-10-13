public class Conta {

    // Membros da classe

    int numero;
    String nome;
    float saldo;
    float limite;
    float quantia;

    // Metodo para depositar

    void deposita(float quantia) {

        saldo = saldo + quantia;
    }

    // Metodo para sacar

    void saca(float quantia) {

        float novoSaldo = saldo - quantia;
        saldo = novoSaldo;
    }

    // Metodo para sacar dinheiro

    void transferir(Conta contaDestino, float quantia) {

        saldo = saldo - quantia;
        contaDestino.saldo = contaDestino.saldo + quantia;
    }

}