package template_method_pattern;

public abstract class CaffeinBeverage {

    final void prepareRecipe() {

    }

    final void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pour in cup");
    }

    abstract void brew();

    abstract void addCondiments();
}
