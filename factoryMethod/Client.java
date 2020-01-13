package factoryMethod;

import factoryMethod.factory.ConcreteFactory;
import factoryMethod.factory.ConcreteFactory1;
import factoryMethod.factory.ConcreteFactory2;
import factoryMethod.product.Product;

public class Client {
	public static void main(String[] args) {
		ConcreteFactory concreteFactory = new ConcreteFactory();
		Product concreteProduct = concreteFactory.factoryMethod();
		
		ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
		Product concreteProduct1 = concreteFactory1.factoryMethod();
		
		ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();
		Product concreteProduct2 = concreteFactory2.factoryMethod();
	}
}
