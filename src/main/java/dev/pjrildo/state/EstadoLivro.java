package dev.pjrildo.state;

public abstract class EstadoLivro {
	
	public abstract void devolver(Livro livro);
	public abstract boolean solicitar(Livro livro);

	public String toString() {
		return "Desconhecido";
	}
}
