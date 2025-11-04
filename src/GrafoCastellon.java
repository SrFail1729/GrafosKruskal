import java.util.HashMap;
import java.util.Map;

public class GrafoCastellon {

    private Map<String, Map<String, Integer>> adyacencias;

    public GrafoCastellon() {
        adyacencias = new HashMap<>();
    }

    public void agregarCiudad(String ciudad){
        //Añade al map un nuevo par clave valor si no existe
        adyacencias.putIfAbsent(ciudad, new HashMap<>());
    }

    //Conectamos los vertices del grafo
    public void conectarCiudades(String ciudad, String ciudad2, int peso){
        adyacencias.get(ciudad).put(ciudad2, peso);
        adyacencias.get(ciudad2).put(ciudad, peso);
    }

    //Mostrar grafo
    public void mostrarGrafo(){
        for (String ciudad: adyacencias.keySet()){
            System.out.println(ciudad + " -> " + adyacencias.get(ciudad));
        }
    }

    public Map<String, Map<String, Integer>> getAdyacencias() {
        return adyacencias;
    }
}
