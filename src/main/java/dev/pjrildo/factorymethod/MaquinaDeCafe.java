package dev.pjrildo.factorymethod;

public class MaquinaDeCafe extends MaquinaDeBebidas {

	public Bebida entregaBebida() {
		return new Cafe();
	}

}
