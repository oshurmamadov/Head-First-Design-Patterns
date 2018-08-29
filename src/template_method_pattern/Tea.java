package template_method_pattern;

public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Brewing tea in da freakn water");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}