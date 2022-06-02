package ar.unrn.eje1;

public class LibroInfantil extends Libro {

	public LibroInfantil(String nombre) {
		super(nombre);

	}

	@Override
	public float monto(int diasAlquilados) {

		if (diasAlquilados > 3)
			return 1.5f + ((diasAlquilados - 3) * 1.5f);

		return 1.5f;
	}

	@Override
	public int puntosAlquilerFrecuente(int diasAlquilados) {
		if (diasAlquilados > 1)
			return 1;
		return 0;
	}

}
