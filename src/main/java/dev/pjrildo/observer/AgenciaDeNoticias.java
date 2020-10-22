package dev.pjrildo.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class AgenciaDeNoticias extends Observable implements Editor {
	
	private List<Observer> canaisComunicacao = new ArrayList<>();
	
	public void adicionaNoticia(String novaNoticia) {
		notifyObservers(novaNoticia);
	}
	
	public void notifyObservers(String novaNoticia) {
		for(Observer observer : canaisComunicacao) {
			observer.update(this, novaNoticia);
		}
	}
	
	public void registrar(Observer observer) {
		canaisComunicacao.add(observer);
	}
}
