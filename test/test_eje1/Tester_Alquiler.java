package test_eje1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.unrn.eje1.Alquiler;
import ar.unrn.eje1.Libro;
import ar.unrn.eje1.LibroInfantil;
import ar.unrn.eje1.LibroNuevoLanzamiento;
import ar.unrn.eje1.LibroRegular;

class Tester_Alquiler {

	@Test
	void test() {
		// Set Up

		// Cliente yo = new Cliente("Rodrigo");
		Alquiler alquiler = new Alquiler();

		Libro elTunel = new LibroInfantil("El Túnel");
		Libro antesDelFin = new LibroRegular("Antes del Fin");
		Libro narnia = new LibroNuevoLanzamiento("Narnia");

		// Test
		float valorEsperado1 = alquiler.calcularDeuda(elTunel, 3);
		float valorEsperado2 = alquiler.calcularDeuda(antesDelFin, 3);
		float valorEsperado3 = alquiler.calcularDeuda(narnia, 3);
		// Verificacion

		assertEquals(valorEsperado1, 1.5f);
		assertEquals(valorEsperado2, 3.5f);
		assertEquals(valorEsperado3, 9f);
	}

	// Falta test de puntos
}
