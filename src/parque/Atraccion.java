package parque;

public class Atraccion extends Producto {
	private int cupo;

	public Atraccion(String nombre, String tipo, int costo, double tiempo, int cupo) {
		super(nombre, tipo, costo, tiempo);
		this.cupo = cupo;

	}

	public int getCupo() {
		return cupo;
	}
	

}
