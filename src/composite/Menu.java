package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    private ArrayList<MenuComponent> menuComponents;
    private String name;
    private String description;

    public Menu(String name, String description) {
        menuComponents = new ArrayList<>();
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void addChild(MenuComponent component) {
        menuComponents.add(component);
    }

    @Override
    public void print() {
        System.out.println("\nName:" + getName());
        System.out.println("Description:" + getDescription());
        Iterator iterator = menuComponents.iterator();
        while(iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
}
