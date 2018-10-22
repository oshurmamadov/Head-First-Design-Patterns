package composite;

public class WaitressTest {
    public static void main(String[] args) {
        MenuComponent lunch = new Menu("Lunch", "Testy lunch");
        MenuComponent first = new MenuItem("Shurpa", 10, "With baranina");
        MenuComponent second = new MenuItem("Oshi Palaw", 16, "Oshi yak vs yak.");
        MenuComponent lunchDesert = new Menu("Lunch Descert", "Indian sweets and stuff");
        MenuComponent sumanak = new MenuItem("Sumanak", 8, "With freakn stones");
        MenuComponent cacke = new MenuItem("Cacke", 4, "Cacke by shirinihoi Shafoat");

        lunchDesert.addChild(sumanak);
        lunchDesert.addChild(cacke);

        lunch.addChild(first);
        lunch.addChild(second);
        lunch.addChild(lunchDesert);

        Waitress waitress = new Waitress(lunch);

        waitress.printMenu();
    }
}
