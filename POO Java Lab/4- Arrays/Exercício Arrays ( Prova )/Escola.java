public class Escola {

    // Atributos da escola

    String nome;

    String email;

    String endereco;

    int telefone;

    Estudante[] estudante = new Estudante[310];

    // Metodos

    void addEstudante(Estudante e) {

        for (int i = 0; i < estudante.length; i++) {

            if (estudante[i] == null) {

                estudante[i] = e; // Adicionando estudante na escola

                break;

            }

        }

    }

    void mostrarInfo() {

        System.out.println("========= INFOS DA ESCOLA ========");

        System.out.println("Nome da escola: " + nome);

        System.out.println("Email da escola: " + email);

        System.out.println("Endereco da escola: " + endereco);

        System.out.println("Telefone da escola: " + telefone);

        for (int i = 0; i < estudante.length; i++) {

            if (estudante[i] != null) {

                estudante[i].mostrarInfo(); // Mostrando as informações do estudante

            }

        }

    }

    void qtdEstudantesPorAno() {

        // Quantidades de alunos por ano

        int alunosPrimeiro = 0;

        int alunosSegundo = 0;

        int alunosTerceiro = 0;

        for (int i = 0; i < estudante.length; i++) {

            if (estudante[i] != null) {

                if (estudante[i].ano.equalsIgnoreCase("Primeiro"))
                    alunosPrimeiro++;

                else if (estudante[i].ano.equalsIgnoreCase("Segundo"))
                    alunosSegundo++;

                else
                    alunosTerceiro++;

            }

        }

    }
}