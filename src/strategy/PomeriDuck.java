package strategy;

import behaviors.DefaultFly;
import behaviors.DefaultQuack;

public class PomeriDuck extends Duck {
	
	public PomeriDuck() {
		flyBehavior = new DefaultFly();
		quackBehavior = new DefaultQuack();
	}

	@Override
	void display() {
		System.out.println("Its Pomeri duck muthafucka....");	
	}

	@Override
	void performFly() {
		flyBehavior.fly();
	}

	@Override
	void performQuack() {
		quackBehavior.quack();
	}
}
