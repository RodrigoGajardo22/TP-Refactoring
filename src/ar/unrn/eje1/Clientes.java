package ar.unrn.eje1;

import java.util.ArrayList;
import java.util.List;

public class Clientes {

	private List<Cliente> clientes;

	public Clientes() {

		clientes = new ArrayList<>();

	}

	public void add(Cliente c) {
		clientes.add(c);
	}
}
