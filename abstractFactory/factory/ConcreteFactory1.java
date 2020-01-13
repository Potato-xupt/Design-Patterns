package abstractFactory.factory;

import abstractFactory.product.AbstractProductA;
import abstractFactory.product.AbstractProductB;
import abstractFactory.product.ProductA1;
import abstractFactory.product.ProductB1;

public class ConcreteFactory1 extends AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}
}
