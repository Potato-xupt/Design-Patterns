package adapter;

import adapter.duck.Duck;
import adapter.duck.MallarDuck;
import adapter.turkey.Turkey;
import adapter.turkey.WildTurkey;

public class DuckTestDrive {
	public static void main(String[] args) {
		Duck duck = new MallarDuck();
		Turkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("The Duck says...");
		duck.quack();
		duck.fly();
		
		System.out.println("THe TurkeyAdapter sasy...");
		turkeyAdapter.quack();
		turkeyAdapter.fly();
	}
}
