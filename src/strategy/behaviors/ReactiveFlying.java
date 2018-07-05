package behaviors;

import strategy.FlyBehavior;

public class ReactiveFlying implements FlyBehavior{

	public ReactiveFlying() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("Reactive flying");
	}
}