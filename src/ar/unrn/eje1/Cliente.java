package ar.unrn.eje1;

public class Cliente {
	private String nombre;
	private int puntos;

	public Cliente(String nombre) {
		this.nombre = nombre;
		puntos = 0;
	}

	public void sumarPuntos() {
		puntos++;
	}

	public String nombre() {
		return nombre;
	}

}
/*
 * En esta clase modifiqué todo. Solo le corresponde instanciar datos del
 * cliente El calculo del costo de alquiler de libros es responsabilidad de la
 * clase Libro, la cual es solicitada por la clase Alquiler.
 * 
 */
