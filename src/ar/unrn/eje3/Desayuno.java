package ar.unrn.eje3;

public class Desayuno extends TipoDeGasto {

	public Desayuno(int gasto) {
		super(gasto);
	}

	@Override
	public String nombre() {
		return "Desayuno";
	}

	@Override
	public String seExcedio(int monto) {

		return monto > 1000 ? "X" : " ";
	}

	@Override
	public int valorComida() {
		return this.gasto;
	}

}
