package ar.unrn.eje3;

public class ReporteDeGastos {

	ProvedorDeFecha fecha;

	public ReporteDeGastos(ProvedorDeFecha fecha) {
		this.fecha = fecha;
	}

	public String datelleDeGastos(Gastos g) {

		String gastos = "Fecha: " + fecha.fecha();

		gastos += "\n\nDetalles: \n";
		gastos += g.detalles();

		gastos += "\n\nMonto de comida: $";
		gastos += g.gastosDeComida();

		gastos += "\n\nMonto total: $";
		gastos += g.gastoTotal();

		return gastos;
	}

}
