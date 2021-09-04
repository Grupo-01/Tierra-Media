package parque;


public class Producto {
	
	private String nombreDeProducto;
	private String tipoDeProducto;
	private double costoTotal;
	private double timepoDeProducto;

	public Producto(String nombreDeProducto, String tipoDeProducto, int costoTotal, double tiempoDeProducto) {
		this.nombreDeProducto = nombreDeProducto;
		this.tipoDeProducto = tipoDeProducto;
		this.costoTotal = costoTotal;
		this.timepoDeProducto = tiempoDeProducto;
	}

	
	public double getCostoTotal() {
		return costoTotal;
	}


	public double getTimepoDeProducto() {
		return timepoDeProducto;
	}


	public String getNombreDeProducto() {
		return nombreDeProducto;
	}


	@Override
	public String toString() {
		return "Producto [nombreDeProducto=" + nombreDeProducto + ", tipoDeProducto=" + tipoDeProducto + ", costoTotal="
				+ costoTotal + ", timepoDeProducto=" + timepoDeProducto + "]";
	}


	
	
	
	


}
