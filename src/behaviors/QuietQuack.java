package behaviors;

import strategy.QuackBehavior;

public class QuietQuack implements QuackBehavior{

	public QuietQuack() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void quack() {
		System.out.println("Quit quack....");
		
	}

}
