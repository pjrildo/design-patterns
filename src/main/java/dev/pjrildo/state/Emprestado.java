package dev.pjrildo.state;

public class Emprestado extends EstadoLivro {
	
	private static Emprestado instancia;

	protected Emprestado() {}

	public static Emprestado instancia() {
		if (instancia == null)
			instancia = new Emprestado();
	
		return instancia;
	}

	public boolean solicitar(Livro livro) {
		System.out.println("O livro " + livro + " não está disponível");
		return false;
	}

	public void devolver(Livro livro) {
		System.out.println("OK, o livro " + livro + " foi devolvido");
		livro.estabelecerEstado(Disponivel.instancia());
	}

	public String toString() {
		return "Emprestado";
	}
}
