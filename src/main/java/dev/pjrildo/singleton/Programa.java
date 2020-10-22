package dev.pjrildo.singleton;

public class Programa {
	
	public static void main(String[] args) {
		
		Conexao conexao = Conexao.getInstance();
		
		System.out.println(conexao);
	}
}
