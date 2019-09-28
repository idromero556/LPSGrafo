package con.fabricas.grafo.logica;

import java.util.List;

import con.fabricas.grafo.modelo.Arco;
import con.fabricas.grafo.modelo.Nodo;

public interface Grafo {
	void addNodo(String nombre);
	void addArco(String origen, String destino, int peso) throws Exception;
	void addArco(String origen, String destino) throws Exception;
	
	List<Arco> obtenerArcos();
	List<Nodo> obtenerNodos();

}
