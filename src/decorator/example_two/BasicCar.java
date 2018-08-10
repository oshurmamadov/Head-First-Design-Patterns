package decorator.example_two;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("---> Assemble basic car");
    }
}
