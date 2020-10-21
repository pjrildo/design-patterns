package dev.pjrildo.facade;

public class ComputadorFacade {

	private Cpu cpu;
	private Memoria memoria;
	private DiscoRigido hd;
	
	ComputadorFacade(){
		this.cpu = new Cpu();
		this.memoria = new Memoria();
		this.hd = new DiscoRigido();
	}
	
	public void run() {
		cpu.processa();
		memoria.carrega();
		hd.le();
	}
}
