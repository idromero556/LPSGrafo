package con.fabricas.grafo.fabrica;

import java.io.FileReader;
import java.util.Properties;

import con.fabricas.grafo.logica.Grafo;
import con.fabricas.grafo.logica.GrafoConPeso;
import con.fabricas.grafo.logica.GrafoSinPeso;


public class Fabrica {
	
	public static String getOpcionConfigurada() {
		// define un valor por defecto
		String opcionConfigurada = "grafoConPeso";  
		
		try {
			// lee el archivo de configuraci�n
			Properties opciones = new Properties();
			opciones.load(new FileReader("config-if.properties"));
			
			// revisa las opciones configuradas
			if (opciones.getProperty("grafoSinPeso", "false").equals("true")) {
				opcionConfigurada = "grafoSinPeso";				
			}

			if (opciones.getProperty("grafoConPeso", "false").equals("true")) {
				opcionConfigurada = "grafoConPeso";				
			}	
		
		} catch (Exception e) {
			// ignora cualquier error leyendo el archivo
		} 
		
		return opcionConfigurada;
	}
	
	public static Grafo  getGrafo() {
				
		// obtiene la opci�n configurada
		String opcion = Fabrica.getOpcionConfigurada();
		
		// crea el objeto de acuerdo a la opci�n configurada
		Grafo grafo = null;
		switch(opcion) {
		
		case "grafoSinPeso":
			grafo = new GrafoSinPeso();
			break;
		case "grafoConPeso":
			grafo = new GrafoConPeso();
			break;
		}
		return grafo;
	}

}
