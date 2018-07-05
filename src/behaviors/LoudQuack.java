package behaviors;

import strategy.QuackBehavior;

public class LoudQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Really loud quack");
	}
}
