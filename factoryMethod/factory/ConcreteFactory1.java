package factoryMethod.factory;


import factoryMethod.product.ConcreteProduct1;
import factoryMethod.product.Product;

public class ConcreteFactory1 extends Factory {

	@Override
	public Product factoryMethod() {
		return new ConcreteProduct1();
	}
	@Override
	public void anOperation() {
		//Ҳ�����Զ���anOperation()����������
		super.anOperation();
	}
}
