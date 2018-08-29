package iterator;

import java.util.Iterator;

public class LunchMenuIterator implements Iterator {
    private int position = 0;
    private MenuItem[] items;

    public LunchMenuIterator(MenuItem[] menuItems) {
        this.items = menuItems;
    }

    @Override
    public boolean hasNext() {
        return items.length > position && items[position] != null;
    }

    @Override
    public Object next() {
        return items[position++];
    }
}