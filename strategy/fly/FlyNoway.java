package strategy.fly;

public class FlyNoway implements FlyBehavior{
	@Override
	public void fly() {
		System.out.println("Sorry,I can't fly.");
	}
}
