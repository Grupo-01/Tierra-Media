package parque;

public class Usuario {
	private String nombre;
	private String gusto;
	private int presupuesto;
	private double tiempoDisponible;

	
	public Usuario(String nombre, String gusto, double tiempoDisponible, int presupuesto) {
		this.nombre = nombre;
		this.gusto = gusto;
		this.tiempoDisponible = tiempoDisponible;
		this.presupuesto = presupuesto;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getGusto() {
		return gusto;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public double getTiempoDisponible() {
		return tiempoDisponible;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", gusto=" + gusto + ", presupuesto=" + presupuesto + ", tiempoDisponible="
				+ tiempoDisponible + "]";
	}



}
