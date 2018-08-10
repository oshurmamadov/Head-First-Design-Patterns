package decorator;

public abstract class Beverage {
    protected String description = "default beverage";

    public String getDescription() {
        return description;
    }
    public abstract double getCost();
}