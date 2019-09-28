package con.fabricas.grafo.fabrica;

import java.util.List;

import con.fabricas.grafo.logica.Grafo;


public class Main {
	public static void main(String[] args) {
		
		try {
			
			Grafo g = Fabrica.getGrafo();
			
			g.addNodo("A");
			g.addNodo("B");
			g.addNodo("C");
			
			g.addArco("A", "B", 1);
			g.addArco("B", "C", 1);
			g.addArco("A", "C", 2);

			System.out.println("Arcos: ");
			g.obtenerArcos().forEach(a -> {
				System.out.println(a.getOrigen()+", "+a.getDestino());
			});
			
			System.out.println("Nodos: ");
			g.obtenerNodos().forEach(a -> {
				System.out.println(a.getNombre());
			});
			
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
