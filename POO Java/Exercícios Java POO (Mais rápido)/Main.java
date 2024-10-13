import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        int Num = 100000;

        long tempoInicial, tempoFinal;

        List<Integer> lista = new ArrayList<>();

        Set<Integer> hashset = new HashSet<>();

        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        // Inserindo no ArrayList

        tempoInicial = System.currentTimeMillis();

        for (int i = 0; i < Num; i++) {

            lista.add(i);

        }

        tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo total da lista= " + (tempoFinal - tempoInicial));

        // Inserindo no Hash Set

        tempoInicial = System.currentTimeMillis();

        for (int i = 0; i < Num; i++) {

            hashset.add(i);

        }

        tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo Total do HashSet= " + (tempoFinal - tempoInicial));

        // Inserindo no HashMap

        tempoInicial = System.currentTimeMillis();

        for (int i = 0; i < Num; i++) {

            hashMap.put(i, i);

        }

        tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo Total do HashMap= " + (tempoFinal - tempoInicial));

        // Fazendo a busca
        // Buscando na List (ArrayList)
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < Num; i++) {
            lista.contains(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para buscar na List: "

                + (tempoFinal - tempoInicial) + "ms");

        // Buscando no HashSet

        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < Num; i++) {
            hashset.contains(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para buscar no Set: "

                + (tempoFinal - tempoInicial) + "ms");

        // Buscando no HashMap

        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < Num; i++) {
            hashMap.containsKey(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo para buscar no Map: "

                + (tempoFinal - tempoInicial) + "ms");

    }

}
