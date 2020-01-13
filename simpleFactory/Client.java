package simpleFactory;

import simpleFactory.factory.SimpleFactory;
import simpleFactory.product.*;

public class Client {
	public static void main(String[] args) {
		SimpleFactory factory = new SimpleFactory();
		Product product1 = factory.createProduct(1);
		Product product2 = factory.createProduct(2);
	}
}
