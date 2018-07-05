package behaviors;

import strategy.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

	public FlyWithWings() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("Flying with wings");
	}
}
