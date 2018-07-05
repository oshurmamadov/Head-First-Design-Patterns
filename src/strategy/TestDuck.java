package strategy;

import behaviors.LoudQuack;
import behaviors.ReactiveFlying;

public class TestDuck {

	public static void main(String[] args) {
		Duck duck = new PomeriDuck();
		duck.display();
		duck.performFly();
		duck.performQuack();
		
		duck.setQuackBehavior(new LoudQuack());
		duck.setFlyBehavior(new ReactiveFlying());
		duck.performFly();
		duck.performQuack();
	}
}