package factoryMethod.factory;

import factoryMethod.product.Product;

public abstract class Factory {
	public abstract Product factoryMethod();
	
	public void anOperation() {
		Product product = factoryMethod();
		// do something with the product
	}
}
