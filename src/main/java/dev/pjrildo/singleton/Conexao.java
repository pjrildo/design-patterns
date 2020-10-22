package dev.pjrildo.singleton;

public class Conexao {
	
	private static Conexao conexao = null;
	
	private Conexao() {
		System.out.println("Conex�o iniciada...");
	}
	
	public static Conexao getInstance() {
		if(conexao == null) {
			return new Conexao();
		}else {
			return conexao;
		}
	}
}
