public class Funcionario {

    // Atributo da classe

    private static int cont = 0;

    public int id;

    public String nome;

    private String cpf;

    public Funcionario(String nome) {

        cont++;

        id = cont;

        this.nome = nome;

    }

    public void mostrarInfos() {

        System.out.println("Nome: " + nome);
        System.out.println("Id: " + id);

    }

    // Encapsulamento - Modificadores de acesso

    public static int getCont() {
        return cont;
    }

    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    

}
