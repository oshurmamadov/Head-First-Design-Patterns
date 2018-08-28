package template_method_pattern;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pour in cup");
    }

    abstract void brew();

    abstract void addCondiments();
}
