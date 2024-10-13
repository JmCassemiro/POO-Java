import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // ArrayList<Integer> itens = new ArrayList<>(); // Declarando Array List

        // Adicionando itens

        // itens.add(1);

        // Imprimindo os dados

        // Forma 1

        // System.out.println(itens);

        // Forma 2

        // for (Integer numbers : itens) {

        // Antes de Ordenar

        // System.out.println("Valor Salvo" + numbers);

        // }

        // Depois de Ordenar

        // Collections.sort(itens);

        // ArrayList de aluno

        ArrayList<Aluno> alunos = new ArrayList<>();

        // Criando Alunos

        Aluno aluno1 = new Aluno("KFPOEQWFKEWOPOK", 45);
        Aluno aluno2 = new Aluno("Jm", 20);
        Aluno aluno3 = new Aluno("Jmx", 32);

        // Adicionando Alunos

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        // Imprimindo Alunos

        Collections.sort(alunos);

        for (Aluno aluno : alunos) {

            System.out.println(aluno);

        }

    }

}
