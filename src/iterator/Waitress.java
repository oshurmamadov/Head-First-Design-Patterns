package iterator;

import java.util.Iterator;

public class Waitress {
    private Menu dinnerMenu;
    private Menu lunchMenu;

    public Waitress(Menu dinnerMenu, Menu lunchMenu) {
        this.dinnerMenu = dinnerMenu;
        this.lunchMenu = lunchMenu;
    }

    public void printMenu() {
        System.out.println("DINNER MENU");
        iterate(dinnerMenu.createIterator());

        System.out.println("\nLUNCH MENU");
        iterate(lunchMenu.createIterator());
    }

    private void iterate(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item.getName() + " " + item.getPrice());
        }
    }
}