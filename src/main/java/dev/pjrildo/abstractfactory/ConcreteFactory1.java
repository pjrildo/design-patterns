package dev.pjrildo.abstractfactory;

public class ConcreteFactory1 extends AbstractFactory {

	AbstractProdutoA createProdutoA() {
		return new ProdutoA1("ProdutoA1");
	}

	AbstractProdutoB createProdutoB() {
		return new ProdutoB1("ProdutoB1");
	}

}
