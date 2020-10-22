package dev.pjrildo.state;

public class Disponivel extends EstadoLivro {
	
	private static Disponivel instancia;

	protected Disponivel() {
			  
	}
	
	public static Disponivel instancia() {
		if (instancia == null)
			instancia = new Disponivel();
	
		return instancia;
	}
	
	public boolean solicitar(Livro livro) {
		System.out.println("Atendendo pedido do livro " + livro);
		livro.estabelecerEstado(Emprestado.instancia());
		return true;
	}
	
	public void devolver(Livro livro) {
		System.out.println("Já tenho o livro " + livro);
	}
	
	public String toString() {
		return "Disponivel";
	}
}
