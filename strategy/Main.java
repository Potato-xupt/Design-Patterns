package strategy;

import strategy.duck.Duck;
import strategy.duck.ModelDuck;
import strategy.fly.FlyWithWings;
import strategy.quack.Squeak;

public class Main {
	public static void main(String[] args) {
		Duck model = new ModelDuck();
		model.performFly();
		model.performQuack();
		model.display();
		
		System.out.println("Ìæ»»²ßÂÔºó.......");
		
		model.setFlyBehavior(new FlyWithWings());
		model.setQuackBehavior(new Squeak());
		model.performFly();
		model.performQuack();
		model.display();
	}
}
