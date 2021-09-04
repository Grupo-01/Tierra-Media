package parque;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class AdministradorDeArchivos {

	public static ArrayDeque<Usuario> leerArchivoDeUsuario(String direccion) {

		ArrayDeque<Usuario> colaDeVisitantes = new ArrayDeque<Usuario>();
		Usuario visitante = null;

		try {
			BufferedReader br = new BufferedReader(new FileReader(direccion));

			String linea, nombre, gusto;
			int presupuesto;
			double tiempoDisponible;
			String[] datosDeLinea;

			while ((linea = br.readLine()) != null) {
				datosDeLinea = linea.split("		");
				nombre = datosDeLinea[0];
				gusto = datosDeLinea[1];
				tiempoDisponible = Double.parseDouble(datosDeLinea[2]);
				presupuesto = Integer.parseInt(datosDeLinea[3]);
				visitante = new Usuario(nombre, gusto, tiempoDisponible, presupuesto);
				colaDeVisitantes.offer(visitante);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		}
		return colaDeVisitantes;
	}

	public static LinkedList<Producto> leerArchivoDeAtracciones(String direccion) {

		LinkedList<Producto> listaDeAtracciones = new LinkedList<Producto>();
		Atraccion unaAtraccion = null;

		try (BufferedReader br = new BufferedReader(new FileReader(direccion));) {

			String linea, nombre, tipo;
			double tiempo;
			int cupo, costo;
			String[] datosDeLinea;

			while ((linea = br.readLine()) != null) {
				datosDeLinea = linea.split("		");
				nombre = datosDeLinea[0];
				costo = Integer.parseInt(datosDeLinea[1]);
				tiempo = Double.parseDouble(datosDeLinea[2]);
				cupo = Integer.parseInt(datosDeLinea[3]);
				tipo = datosDeLinea[4];

				unaAtraccion = new Atraccion(nombre, tipo, costo, tiempo, cupo);
				listaDeAtracciones.add(unaAtraccion);
			}
			br.close();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {

		}
		return listaDeAtracciones;

	}

	public static LinkedList<Producto> leerArchivoDePromos(String direccion) {

		LinkedList<Producto> listaDePromos = new LinkedList<Producto>();

		try (BufferedReader br = new BufferedReader(new FileReader(direccion));) {

			String linea;
			String[] datosDeLinea;

			while ((linea = br.readLine()) != null) {

				datosDeLinea = linea.split("	");

				listaDePromos.add(AdministradorDeArchivos.pepe(datosDeLinea));
			}
			br.close();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {

		}
		return listaDePromos;

	}

	private static Producto pepe (String[] datosDeLinea) {
		Producto unaPromo = null;
		String nombreDePromo = datosDeLinea[1];
		String tipoDeProducto = datosDeLinea[2];
		double tiempoTotal = 0;
		int costoTotal = 0;
		ArrayList<Producto> atraccionesDePromo = new ArrayList<Producto>();

		for (int i = 4; i < datosDeLinea.length; i++) {

			for (Producto elemento : TierraMedia.getAtracciones()) {
				if (elemento.getNombreDeProducto().equals(datosDeLinea[i]) ) {
					atraccionesDePromo.add(elemento);
					tiempoTotal += elemento.getTimepoDeProducto();
					costoTotal += elemento.getCostoTotal();
				}
			}
		}
		if (datosDeLinea[0].equals("porcentual") ) {
			double descuento = Double.parseDouble(datosDeLinea[3]);
			unaPromo = new PromoPorcentual(nombreDePromo, tipoDeProducto, descuento, costoTotal, tiempoTotal, atraccionesDePromo);
		}
		if (datosDeLinea[0].equals("AxB")) {
			String productoGratis = datosDeLinea[3];
			unaPromo = new PromoAxB(nombreDePromo, tipoDeProducto, productoGratis, costoTotal, tiempoTotal, atraccionesDePromo);
		}
		if (datosDeLinea[0].equals("absoluta")) {
			int cosotoDelPack = Integer.parseInt(datosDeLinea[3]);
			unaPromo = new PromoAbsoluta(nombreDePromo, tipoDeProducto, cosotoDelPack, tiempoTotal, atraccionesDePromo);
		}
	return unaPromo;
	}
}
