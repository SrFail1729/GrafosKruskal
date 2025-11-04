import java.util.HashMap;

import java.util.Map;
import java.util.Set;

public class UnionEncontrados {
    private Map <String,String> ciudades;

    public UnionEncontrados(Set<String> ciudadesSinRepetir) {
        ciudades = new HashMap<>();
        for (String ciudad: ciudadesSinRepetir){
            ciudades.put(ciudad,ciudad);
        }
    }

    public String encontrado(String ciudad){
        if (!ciudades.get(ciudad).equals(ciudad)) {
            ciudades.put(ciudad,encontrado(ciudades.get(ciudad)));
        }
        return ciudades.get(ciudad);
    }

    public void union(String a, String b){
        String rootA = encontrado(a);
        String rootB = encontrado(b);

        if (!rootA.equals(rootB)){
            ciudades.put(rootA,rootB);
        }
    }

    public boolean conectado(String a, String b){
        return encontrado(a).equals(encontrado(b));
    }
}
