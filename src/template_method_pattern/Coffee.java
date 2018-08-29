package template_method_pattern;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Brewing coffee in da water");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}