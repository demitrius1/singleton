package com.singleton.app;

public class Presidente {

	private	 static Presidente cargoOcupado;

	private Presidente() {}

	public static Presidente getInstance() {
		if (cargoOcupado == null)
			cargoOcupado = new Presidente();
		return cargoOcupado;
	}
}