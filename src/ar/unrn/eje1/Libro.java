package ar.unrn.eje1;

public abstract class Libro {
	// public static final int INFANTILES = 2;
	// public static final int REGULARES = 0;
	// public static final int NUEVO_LANZAMIENTO = 1;

	/*
	 * Quitamos esto y utilizamos Polimorfismo.
	 * 
	 * Tambien quitamos la clase CopiaLibro, ya que era innecesaria.
	 * 
	 */

	private String nombre;

	public Libro(String nombre) {
		this.nombre = nombre;

	}

	abstract public float monto(int diasAlquilados);

	public int puntosAlquilerFrecuente(int diasAlquilados) {
		return 0;
	}

	public String nombre() {
		return nombre;
	}
}