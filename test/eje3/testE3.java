package eje3;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import ar.unrn.eje3.AlquilerDeAuto;
import ar.unrn.eje3.Cena;
import ar.unrn.eje3.Desayuno;
import ar.unrn.eje3.Gastos;
import ar.unrn.eje3.ProvedorDeFecha;
import ar.unrn.eje3.ReporteDeGastos;
import ar.unrn.eje3.TipoDeGasto;

public class testE3 {

	TipoDeGasto c1, c2, c3, d1, d2, a1, a2;

	ProvedorDeFecha fecha = new ProvedorDeFecha();

	List<TipoDeGasto> lista = new ArrayList();

	@Test
	void testDetalle() {
		// Set Up
		d1 = new Desayuno(100);
		d2 = new Desayuno(200);

		c1 = new Cena(300);
		c2 = new Cena(400);
		c3 = new Cena(500);

		a1 = new AlquilerDeAuto(1000);
		a2 = new AlquilerDeAuto(2000);

		lista.add(a1);
		// lista.add(c1);
		// lista.add(d1);

		Gastos g = new Gastos(lista);

		ReporteDeGastos reporte = new ReporteDeGastos(fecha);

		// Testeo

		String str = "Fecha: 2022-05-04" + "\n\nDetalles: \n" + " Alquiler de auto  $1000 \\n";
		// Verificacion

		Assert.assertEquals(str, reporte.datelleDeGastos(g));

	}

}
