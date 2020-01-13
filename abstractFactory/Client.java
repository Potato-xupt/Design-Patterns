package abstractFactory;

import abstractFactory.factory.AbstractFactory;
import abstractFactory.factory.ConcreteFactory1;
import abstractFactory.product.AbstractProductA;
import abstractFactory.product.AbstractProductB;

public class Client {
	public static void main(String[] args) {
		AbstractFactory abstractFactory = new ConcreteFactory1();
		AbstractProductA productA = abstractFactory.createProductA();
		AbstractProductB productB = abstractFactory.createProductB();
	}
}
