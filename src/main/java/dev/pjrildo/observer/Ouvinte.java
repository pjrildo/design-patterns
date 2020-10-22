package dev.pjrildo.observer;

public class Ouvinte {
	
	public static void main(String[] args) {
		AgenciaDeNoticias agencia = new AgenciaDeNoticias();
		Radio radio = new Radio();
		
		agencia.registrar(radio);
		
		agencia.adicionaNoticia("Pandemia de COVID-19 na China");
		agencia.adicionaNoticia("COVID-19 se espalha pelo mundo");
		agencia.adicionaNoticia("Primeira morte por COVID-19 no Brasil é registrada");
	}
}
