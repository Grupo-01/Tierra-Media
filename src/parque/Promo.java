package parque;

import java.util.ArrayList;

public class Promo extends Producto {

	private ArrayList<Producto> atracciones;

	public Promo( String nombreDeProducto, String tipoDeProducto,
				int costoTotal, double tiempoDeProducto, ArrayList<Producto>  atracciones) {
		super(nombreDeProducto, tipoDeProducto, costoTotal, tiempoDeProducto);
		this.atracciones = atracciones;
	}
	



}
