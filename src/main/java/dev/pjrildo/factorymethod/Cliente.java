package dev.pjrildo.factorymethod;

public class Cliente {
	
	public static void main(String[] args) {
		
		MaquinaDeBebidas maquina = new MaquinaDeCafe();
		
		maquina.exibeMensagem();
		
		Bebida cafe = maquina.entregaBebida();
		System.out.println(cafe);
	}
}
