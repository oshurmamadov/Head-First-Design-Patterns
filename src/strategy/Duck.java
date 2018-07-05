package strategy;

public abstract class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;

	abstract void display();
	abstract void performFly();
	abstract void performQuack();
	
	void setFlyBehavior(FlyBehavior fly) {
		this.flyBehavior = fly;
	}
	
	void setQuackBehavior(QuackBehavior quack) {
		this.quackBehavior = quack;
	}
}