package parque;

public class Atraccion extends Producto {
	private int cupo;

	public Atraccion(String nombre, String tipoDeProducto, int costo, double tiempo, int cupo) {
		super(nombre, tipoDeProducto, costo, tiempo);
		this.cupo = cupo;

	}

	public int getCupo() {
		return cupo;
	}
	

}
