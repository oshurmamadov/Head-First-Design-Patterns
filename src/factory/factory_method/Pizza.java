package factory.factory_method;

public abstract class Pizza {
    protected String name;
    protected String sauce;

    protected void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Adding " + sauce);
    }

    protected void bake() {
        System.out.println("Baking for 30 mins");
    }

    protected void cut() {
        System.out.println("Cutting into 6 pieces");
    }

    protected void box() {
        System.out.println("Preparing to ship this damn pizzza");
    }
}
