package ar.unrn.eje1;

public class Alquiler {

	private Clientes ListaClientes;

	public Alquiler() {
		ListaClientes = new Clientes();
	}

	public float calcularDeuda(Libro l, int diasDeAlquiler) {

		return l.monto(diasDeAlquiler);
	}

	private int sumarPuntos(Libro l, int diasDeAlquiler) {

		return l.puntosAlquilerFrecuente(diasDeAlquiler);
	}

	public void alquilar(Libro l, Cliente cliente, int diasDeAlquiler) {
		ListaClientes.add(cliente);
		if (sumarPuntos(l, diasDeAlquiler) == 1)
			cliente.sumarPuntos();
	}

	/*
	 * La clase Alquiler administra todo: -Clientes -Puntos -Costo del alquiler del
	 * libro.
	 */

}