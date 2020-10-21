package dev.pjrildo.abstractfactory;

public class Cliente {
	
	public static void main(String[] args) {
		AbstractFactory abstfact = CriaFactory.getFactory("a");
        AbstractProdutoA produtoA = abstfact.createProdutoA();
        
        System.out.println(produtoA);
	}

}
