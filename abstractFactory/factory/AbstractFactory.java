package abstractFactory.factory;

import abstractFactory.product.AbstractProductA;
import abstractFactory.product.AbstractProductB;

public abstract class AbstractFactory {
	public abstract AbstractProductA createProductA();
	public abstract AbstractProductB createProductB();
}
