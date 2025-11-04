public class Arista implements Comparable<Arista>{

    String origen;
    String destino;
    int peso;

    public Arista(String origen, String destino, int peso) {
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }


    @Override
    public int compareTo(Arista otra) {
        return Integer.compare(this.peso, otra.peso);
    }

    @Override
    public String toString() {
        return origen + " - " + destino + " : " + peso;
    }
}
