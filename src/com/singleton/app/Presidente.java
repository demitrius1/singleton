package com.singleton.app;

public class Presidente {

	private	static Presidente cargoUnico;

	private Presidente() {}

	public static Presidente getInstance() {
		if (cargoUnico == null)
			cargoUnico = new Presidente();
		return cargoUnico;
	}

}