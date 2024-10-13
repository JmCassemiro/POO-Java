package br.inatel.cdg;

public class Main {

    public static void main(String[] args) {

        Cliente c1 = new Cliente();

        c1.setNome("JM");
        c1.setCpf(1234567);

        Cliente c2 = new Cliente();

        c2.setNome("Besourinho");
        c2.setCpf(1224124);

        Cliente[] cliente = new Cliente[2];

        cliente[0] = c1;
        cliente[1] = c2;

        Conta conta = new Conta();

        conta.setCliente(cliente);
        conta.setLimite(500);
        conta.setNumero(359974861);

        System.out.println(conta.getSaldo());

        conta.deposita(500);

        System.out.println(conta.getSaldo());

        conta.sacar(200);

        System.out.println(conta.getSaldo());

        conta.sacar(1000);

    }

}
