package dev.pjrildo.templatemethod;

public class TreinoMeioTemporada extends Treino {

	@Override
	void preparoFisico() {
		System.out.println("Preparo físico intenso...");
	}

	@Override
	void jogoTreino() {
		System.out.println("Jogo treino com equipe reserva...");
	}

}
