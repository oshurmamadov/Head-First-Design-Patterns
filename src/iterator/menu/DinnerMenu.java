package iterator.menu;

import iterator.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class DinnerMenu implements Menu {
    private ArrayList<MenuItem> menuItems;

    public DinnerMenu() {
        menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("Oshi yak ba yak", 20));
        menuItems.add(new MenuItem("Murgbiryon", 33.3));
        menuItems.add(new MenuItem("Manty", 13.5));
    }


    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
