package ar.unrn.eje1;

public class Main {
	public static void main(String args[]) {
		Libro elTunel = new LibroInfantil("El Túnel");
		Libro antesDelFin = new LibroRegular("Antes del Fin");
		Libro sombrasNegras = new LibroNuevoLanzamiento("Sombras Negras");

		Cliente yo = new Cliente("Rodrigo");
		Alquiler alquiler = new Alquiler();

		alquiler.alquilar(antesDelFin, yo, 2);
		alquiler.alquilar(sombrasNegras, yo, 3);

		System.out.println(yo.nombre() + " Deduda: " + alquiler.calcularDeuda(sombrasNegras, 2));
	}

}
