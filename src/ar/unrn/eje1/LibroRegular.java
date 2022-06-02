package ar.unrn.eje1;

public class LibroRegular extends Libro {

	public LibroRegular(String nombre) {
		super(nombre);
	}

	@Override
	public float monto(int diasAlquilados) {
		float monto = 2f;
		if (diasAlquilados > 2)
			return monto + ((diasAlquilados - 2) * 1.5f);

		return monto;
	}

}
