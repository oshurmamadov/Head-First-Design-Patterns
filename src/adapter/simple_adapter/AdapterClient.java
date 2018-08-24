package adapter.simple_adapter;

public class AdapterClient {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck duckLikeTurkey = new DuckAdapter(new AlabamaTurkey());

        mallardDuck.fly();
        mallardDuck.quack();

        System.out.println("\n");

        duckLikeTurkey.fly();
        duckLikeTurkey.quack();
    }
}
