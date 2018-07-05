package behaviors;

import strategy.FlyBehavior;

public class DefaultFly implements FlyBehavior {

	public DefaultFly() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("Sorry, I am not flying");
	}
}
