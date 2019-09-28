package con.fabricas.grafo.logica;

import java.util.ArrayList;
import java.util.List;

import con.fabricas.grafo.modelo.Arco;
import con.fabricas.grafo.modelo.Nodo;

public class GrafoSinPeso implements Grafo{

	List<Nodo> nodos = new ArrayList<Nodo>();
	List<Arco> arcos = new ArrayList<Arco>();

	public void addNodo(String nombre) {
		// TODO Auto-generated method stub
		Nodo nodo = new Nodo();
		nodo.setNombre(nombre);
		nodos.add(nodo);
	}

	public void addArco(String origen, String destino, int peso) throws Exception {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
		
	}
	
	public Nodo buscarNodo(String nombre) 
	{
		for (Nodo nodo: nodos) {
			if (nodo.getNombre().equals(nombre)) {
				return nodo;
			}
		}
		return null;
	}

	
	private void addArco(Nodo nodoOrigen, Nodo nodoDestino)
	{
		Arco arco = new Arco();
		arco.setOrigen(nodoOrigen);
		arco.setDestino(nodoDestino);
		arcos.add(arco);
		nodoOrigen.agregarArco(arco);
	}

	
	public void addArco(String origen, String destino) throws Exception {
		
		Nodo nodoOrigen = buscarNodo(origen);
		Nodo nodoDestino = buscarNodo(destino);
		
		// Origen o destino no encontrado
		if (nodoOrigen == null) {
			throw new RuntimeException("Error en la B�squeda: NodoOrigen no encontrado");
		}
		if (nodoDestino == null) {
			throw new RuntimeException("Error en la B�squeda: NodoOrigen no encontrado");
		}
		
		addArco(nodoOrigen, nodoDestino);
	}

	@Override
	public List<Arco> obtenerArcos() {
		// TODO Auto-generated method stub
		return arcos;
	}

	@Override
	public List<Nodo> obtenerNodos() {
		// TODO Auto-generated method stub
		return nodos;
	}

	

}
