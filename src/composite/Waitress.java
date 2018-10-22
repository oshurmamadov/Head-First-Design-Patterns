package composite;

public class Waitress {
    private MenuComponent menuComponent;

    public Waitress(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    public void printMenu() {
        menuComponent.print();
    }
}