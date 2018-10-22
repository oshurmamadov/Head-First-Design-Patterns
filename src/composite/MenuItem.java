package composite;

public class MenuItem extends MenuComponent {
    private String name;
    private double price;
    private String description;

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description + " price:" + getPrice();
    }

    @Override
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("\n-->Name:" + getName());
        System.out.println("Description:" + getDescription());
        System.out.println("---------------------------------");
    }
}