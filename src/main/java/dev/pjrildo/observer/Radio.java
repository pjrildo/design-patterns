package dev.pjrildo.observer;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Radio implements Observer {

	@Override
	public void update(Observable agencia, Object novaNoticia) {
		if(agencia instanceof Editor) {
			System.out.println((String) novaNoticia);
		}
	}

}
