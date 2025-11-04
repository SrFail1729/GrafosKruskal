void main() {

    GrafoCastellon grafo = new GrafoCastellon();

    // Agregar ciudades
    grafo.agregarCiudad("Castellón de la plana");
    grafo.agregarCiudad("Villareal");
    grafo.agregarCiudad("Nules");
    grafo.agregarCiudad("Almazora");
    grafo.agregarCiudad("Burriana");
    grafo.agregarCiudad("Bennicassim");

    // Conectar ciudades (solo una vez por par)
    grafo.conectarCiudades("Castellón de la plana", "Villareal",2);
    grafo.conectarCiudades("Castellón de la plana", "Almazora",1);
    grafo.conectarCiudades("Castellón de la plana", "Bennicassim",1);
    grafo.conectarCiudades("Villareal", "Almazora",1);
    grafo.conectarCiudades("Villareal", "Nules",3);
    grafo.conectarCiudades("Almazora", "Burriana",2);

    // Mostrar el grafo
    grafo.mostrarGrafo();


    //Uso algoritmo kruskal
    Kruskal kruskal = new Kruskal();
    System.out.println("\nÁrbol de expansión mínima (Kruskal):");
    List<Arista> mst = kruskal.kruskal(grafo.getAdyacencias());
    int costoTotal = 0;
    for (Arista a : mst) {
        System.out.println(a);
        costoTotal += a.peso;
    }
    System.out.println("Costo total: " + costoTotal);
}