import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Kruskal {
    private List<Arista> aristas = new ArrayList<>();

    //Creamos lista de todas las aristas
    public List<Arista> kruskal(Map<String, Map<String, Integer>> adyacencias){
        for (String ciudad : adyacencias.keySet()){
            for (Map.Entry<String, Integer> entry : adyacencias.get(ciudad).entrySet()){
                String vecino = entry.getKey();
                int peso = entry.getValue();
                if (ciudad.compareTo(vecino) < 0){
                    aristas.add(new Arista(ciudad,vecino,peso));
                }
            }

        }

        Collections.sort(aristas);

        UnionEncontrados ue = new UnionEncontrados(adyacencias.keySet());
        List<Arista> mst = new ArrayList<>();

        for (Arista arista : aristas){
            if (!ue.conectado(arista.origen, arista.destino)){
                ue.union(arista.origen, arista.destino);
                mst.add(arista);
            }
        }

        return mst;
    }
}
