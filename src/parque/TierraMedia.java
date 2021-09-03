package parque;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;

public class TierraMedia {

	private static ArrayDeque<Usuario> colaDeVisitantes = new ArrayDeque<Usuario>();
	private static LinkedList<Producto> productosOfertables = new LinkedList<Producto>();
	private static LinkedList<Atraccion> atracciones = new LinkedList <Atraccion>();
	HashMap<String,LinkedList<Atraccion>>Promos = new HashMap<String,LinkedList<Atraccion>>();

	public static void main(String[] arg) throws IOException {
		
		Usuario visitante;
		
		colaDeVisitantes = AdministradorDeArchivos.leerArchivoDeUsuario("usuarios.txt");
		atracciones = AdministradorDeArchivos.leerArchivoDeAtracciones("atracciones.txt");
		
		while (!colaDeVisitantes.isEmpty()) {
			visitante = colaDeVisitantes.poll();
			System.out.println(visitante);
			/*
			 Lo que sigue Es sumar las dos Listas 
			 atracciones + promos = productos ofertables
			 y hacer el compare to y ordenar las lista de ofertables
			 
			*/
			
			for(Atraccion elemento : atracciones) {
				System.out.println(elemento);
			}
			
		}
	}
}
