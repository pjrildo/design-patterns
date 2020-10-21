package dev.pjrildo.abstractfactory;

public class ConcreteFactory2 extends AbstractFactory {

	@Override
	AbstractProdutoA createProdutoA() {
		return new ProdutoA2("ProdutoA2");
	}

	@Override
	AbstractProdutoB createProdutoB() {
		return new ProdutoB2("ProdutoB2");
	}

}
