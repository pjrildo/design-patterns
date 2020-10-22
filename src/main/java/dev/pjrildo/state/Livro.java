package dev.pjrildo.state;

public class Livro {
	
	private EstadoLivro estado;
	private String titulo;
	
	public Livro(String titulo) {
		this.titulo = titulo;
		estado = Disponivel.instancia();
	}

	public String toString() {
		return (titulo + " (" + estado + ")" );
	}

	void estabelecerEstado(EstadoLivro estado) {
		System.out.println("Transitando de " + this.estado + " a " + estado);
		this.estado = estado;
	}

	public void devolver() {
		estado.devolver(this);
	}

	public boolean solicitar() {
		return estado.solicitar(this);
	}
}