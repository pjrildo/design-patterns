package dev.pjrildo.state;

public class Biblioteca {
	
	public static void main(String[] args) {
		Livro l1 = new Livro("Design Patterns");
	    Livro l2 = new Livro("Java Programming Language");

	    l1.solicitar();
	    l1.solicitar();
	    l1.devolver();

	    l2.devolver();
	}
}
