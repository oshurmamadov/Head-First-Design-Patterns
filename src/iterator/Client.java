package iterator;

public class Client {

    public static void main(String[] args) {
        Menu dinner = new DinnerMenu();
        Menu lunch = new LunchMenu();

        Waitress waitress = new Waitress(dinner, lunch);

        waitress.printMenu();
    }
}
