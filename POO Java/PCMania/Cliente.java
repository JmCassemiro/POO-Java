public class Cliente {

    // Atributos

    String nome;

    long cpf;

    Computador[] computers = new Computador[3];

    // Metodos

    float calculaTotalCompra() {

        float valortotal = 0;

        for (int i = 0; i < computers.length; i++) {

            if (computers[i] != null) {

                valortotal += computers[i].preco;

            }

        }

        return valortotal;
    }

    // Metodo para adicionar pc em um array
    void addPc(Computador pc) {

        for (int i = 0; i < computers.length; i++) {

            if (computers[i] == null) {

                computers[i] = pc;

                break;
            }

        }

    }
}