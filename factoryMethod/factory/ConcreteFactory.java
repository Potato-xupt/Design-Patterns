package factoryMethod.factory;

import factoryMethod.product.ConcreteProduct;
import factoryMethod.product.Product;

public class ConcreteFactory extends Factory {

	@Override
	public Product factoryMethod() {
		return new ConcreteProduct();
	}
	
	@Override
	public void anOperation() {
		//也可以自定义anOperation()方法操作。
		super.anOperation();
	}
}
