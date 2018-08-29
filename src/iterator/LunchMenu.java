package iterator;

import java.util.Iterator;

public class LunchMenu implements Menu {
    private MenuItem[] menuItems;

    public LunchMenu() {
        menuItems = new MenuItem[3];

        menuItems[0] = new MenuItem("Samsy", 5);
        menuItems[1] = new MenuItem("Shaverma", 10);
        menuItems[2] = new MenuItem("Sosiska v teste", 1.8);
    }

    @Override
    public Iterator createIterator() {
        return new LunchMenuIterator(menuItems);
    }
}
