package br.inatel.cdg;

public class Conta {

    // Atributos

    private int numero;

    private float saldo;

    private float limite;

    private Cliente[] cliente;

    // Construtor

    public Conta() {

        cliente = new Cliente[2];

    }

    // Settando e gettando

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void setCliente(Cliente[] cliente) {
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    // Metodos

    public void sacar(float quantia) {

        if (saldo >= quantia) {

            this.saldo -= quantia;

        }

        else {

            System.out.println("Saldo Insuficiente");

        }

    }

    public void deposita(float quantia) {

        this.saldo += quantia;

    }

}
