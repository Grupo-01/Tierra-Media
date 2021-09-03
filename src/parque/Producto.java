package parque;


public class Producto {
	
	private String nombre;
	private String tipo;
	private double costo;
	private double tiempo;

	public Producto(String nombre, String tipo, int costo, double tiempo) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.costo = costo;
		this.tiempo = tiempo;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", tipo=" + tipo +
				", costo=" + costo + ", tiempo=" + tiempo + "]";
	}
	
	
	
	
	


}
