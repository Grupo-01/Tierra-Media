package parque;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;

public class AdministradorDeArchivos {

	public static ArrayDeque<Usuario> leerArchivoDeUsuario(String direccion) {

		ArrayDeque<Usuario> colaDeVisitantes = new ArrayDeque<Usuario>();
		Usuario visitante = null;

		try {
			BufferedReader br = new BufferedReader(new FileReader(direccion));

			String linea, nombre, gusto;
			int  presupuesto;
			double tiempoDisponible;
			String[] datosDeLinea;

			while ((linea = br.readLine()) != null) {
				datosDeLinea = linea.split(",");
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

	public static LinkedList<Atraccion> leerArchivoDeAtracciones(String direccion) {

		LinkedList<Atraccion> listaDeAtracciones = new LinkedList<Atraccion>();
		Atraccion unaAtraccion = null;

		try (BufferedReader br = new BufferedReader(new FileReader(direccion));) {

			String linea, nombre, tipo;
			double tiempo;
			int cupo, costo;
			String[] datosDeLinea;

			while ((linea = br.readLine()) != null) {
				datosDeLinea = linea.split("	");
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

	public static HashMap<String,LinkedList<Atraccion>> leerArchivoDePromos(String direccion) {

		HashMap<String,LinkedList<Atraccion>>listaDePromos = new HashMap<String,LinkedList<Atraccion>>();
		Promo unaPromo = null;

		try (BufferedReader br = new BufferedReader(new FileReader(direccion));) {

			String linea, nombre, tipoDePromo,tipoDeAventura;
			int tiempo, costo;
			String[] datosDeLinea;
// esto no anda jaja
			while ((linea = br.readLine()) != null) {
				datosDeLinea = linea.split("	");
				tipoDePromo = datosDeLinea[0];
				tipoDeAventura = datosDeLinea[1];

				
				if(tipoDePromo == "absoluta")
				unaPromo = new PromoAbsoluta(nombre, tipo, costo, tiempo);
				
				if(tipoDePromo == "procentual")
				unaPromo = new PromoPorcentual(nombre, tipo, costo, tiempo);
				
				if(tipoDePromo == "AXB")
				unaPromo = new PromoAxB(nombre, tipo, costo, tiempo);


				
			}
			br.close();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {

		}
		return listaDePromos;

	}
}
