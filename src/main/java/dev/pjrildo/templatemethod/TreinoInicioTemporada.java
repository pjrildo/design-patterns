package dev.pjrildo.templatemethod;

public class TreinoInicioTemporada extends Treino {

	@Override
	void preparoFisico() {
		System.out.println("Preparo f�sico leve...");
	}

	@Override
	void jogoTreino() {
		System.out.println("Jogo treino com equipe j�nior...");
	}
}
