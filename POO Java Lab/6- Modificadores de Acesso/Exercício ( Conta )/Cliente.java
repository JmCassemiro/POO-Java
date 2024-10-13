public class Cliente {
    private String nome;
    private int id;
    private static int cont = 0;

    public Cliente(String nome) {
        cont++;
        id = cont;
        this.nome = nome;
        System.out.println("Cliente adicionado com sucesso!!");
    }

    public String getNome() { // mostra o nome do cliente
        return nome;
    }

    public int getId() { // mostra o ID dos clientes
        return id;
    }

    public static int getCont() { // mostra quantidade de clientes
        return cont;
    }
}
