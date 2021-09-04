package parque;

import java.util.ArrayList;

public class PromoAxB extends Promo {
	
	private String AtraccionGratis;

	public PromoAxB( String nombreDeProducto, String tipoDeProducto, String atraccionGratis,
						int costoTotal, double tiempoDeProducto, ArrayList<Producto> atraccionesDePromo) {

		super( nombreDeProducto, tipoDeProducto, costoTotal,
				tiempoDeProducto, atraccionesDePromo);
		this.AtraccionGratis = atraccionGratis;
	}



}
