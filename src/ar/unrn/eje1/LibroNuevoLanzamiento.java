package ar.unrn.eje1;

public class LibroNuevoLanzamiento extends Libro {

	public LibroNuevoLanzamiento(String nombre) {
		super(nombre);
	}

	@Override
	public float monto(int diasAlquilados) {

		return diasAlquilados * 3f;
	}

}
