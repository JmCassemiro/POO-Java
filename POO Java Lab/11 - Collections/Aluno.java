
public class Aluno implements Comparable<Aluno> {

    private String nome;

    private int idade;

    public Aluno(String nome, int i) {
        this.nome = nome;
        this.idade = i;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int compareTo(Aluno alunoComparado) {

        // return Integer.compare(this.idade,alunoComparado.idade);

        return this.nome.compareTo(alunoComparado.getNome());

    }

}