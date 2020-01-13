package abstractFactory.factory;

import abstractFactory.product.AbstractProductA;
import abstractFactory.product.AbstractProductB;
import abstractFactory.product.ProductA2;
import abstractFactory.product.ProductB2;

public class ConcreteFactory2 extends AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}
}
