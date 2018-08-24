package adapter.simple_adapter;

public class AlabamaTurkey implements Turkey {
    @Override
    public void gamble() {
        System.out.println("Alabama turkey gamble a.k.a quack");
    }

    @Override
    public void fly() {
        System.out.println("Alabama turkey short fly");
    }
}
