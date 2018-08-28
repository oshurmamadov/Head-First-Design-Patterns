package template_method_pattern;

public class TemplateMethodPatternTest {

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        tea.prepareRecipe();

        System.out.println("\n");

        coffee.prepareRecipe();
    }
}
