package behaviors;

import strategy.QuackBehavior;

public class DefaultQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Damn, cant produce quack");
	}
}
