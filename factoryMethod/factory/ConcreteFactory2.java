package factoryMethod.factory;

import factoryMethod.product.ConcreteProduct2;
import factoryMethod.product.Product;

public class ConcreteFactory2 extends Factory {

	@Override
	public Product factoryMethod() {
		return new ConcreteProduct2();
	}
	
	@Override
	public void anOperation() {
		//Ҳ�����Զ���anOperation()����������
		super.anOperation();
	}
}
