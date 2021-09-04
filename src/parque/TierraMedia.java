package parque;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class TierraMedia {

	private static ArrayDeque<Usuario> colaDeVisitantes = new ArrayDeque<Usuario>();
	private static LinkedList<Producto> productosOfertables = new LinkedList<Producto>();
	private static LinkedList<Producto> atracciones = new LinkedList<Producto>();
	private static LinkedList<Producto> listaDePromos = new LinkedList<Producto>();

	public static LinkedList<Producto> getAtracciones() {
		return atracciones;
	}

	public static void main(String[] arg) throws IOException {

		Usuario visitante;

		colaDeVisitantes = AdministradorDeArchivos.leerArchivoDeUsuario("usuarios.txt");
		atracciones = AdministradorDeArchivos.leerArchivoDeAtracciones("atracciones.txt");
		listaDePromos = AdministradorDeArchivos.leerArchivoDePromos("promos.txt");
		productosOfertables.addAll(atracciones);
		productosOfertables.addAll(listaDePromos);

		while (!colaDeVisitantes.isEmpty()) {
			visitante = colaDeVisitantes.poll();
			System.out.println(visitante);
			System.out.println("---------------------------------------------------------------------------------------------------------------");

			for (Producto elemento : productosOfertables) {
				System.out.println("---------------------------------------------------------------------------------------------------------------");

				System.out.println(elemento);
			}
			System.out.println("---------------------------------------------------------------------------------------------------------------");


		}

	}

}
