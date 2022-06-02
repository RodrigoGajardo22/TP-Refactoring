package ar.unrn.eje3;

public abstract class TipoDeGasto {

	protected int gasto;

	public TipoDeGasto(int gasto) {

		this.gasto = gasto;
	}

	public int monto() {
		return this.gasto;
	}

	public abstract String nombre();

	public abstract String seExcedio(int monto);

	public abstract int valorComida();

}
