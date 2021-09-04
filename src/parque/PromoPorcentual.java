package parque;

import java.util.ArrayList;

public class PromoPorcentual extends Promo {
	private double descuento;

	public PromoPorcentual( String nombreDeProducto, String tipoDeProducto, double descuento,
						int costoTotal, double tiempoDeProducto, ArrayList<Producto> atracciones) {

		super( nombreDeProducto, tipoDeProducto, costoTotal,
				tiempoDeProducto, atracciones);
		this.descuento = descuento;
	}

}
