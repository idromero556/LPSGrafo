package con.fabricas.grafo.modelo;

import java.util.ArrayList;
import java.util.List;


public class Nodo {
	private String 		nombre;
	private List<Arco>	arcos = new ArrayList<Arco>();
	
	public Nodo() { }
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarArco(Arco arco) {
		arcos.add(arco);
	}

	public List<Arco> getArcos() {
		return arcos;
	}
	
	public List<Nodo> getNodosAdyacentes() {
		List<Nodo> nodos = new ArrayList<Nodo>();
		for (Arco arco : arcos) {
			nodos.add(arco.getDestino());
		}
		return nodos;
	}

}
