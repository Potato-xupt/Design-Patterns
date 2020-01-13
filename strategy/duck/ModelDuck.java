package strategy.duck;

import strategy.fly.FlyNoway;
import strategy.quack.MuteQuack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoway();
		quackBehavior = new MuteQuack();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}
}
