package dev.pjrildo.templatemethod;

public class TreinoMeioTemporada extends Treino {

	@Override
	void preparoFisico() {
		System.out.println("Preparo f�sico intenso...");
	}

	@Override
	void jogoTreino() {
		System.out.println("Jogo treino com equipe reserva...");
	}

}
