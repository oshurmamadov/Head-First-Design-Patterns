package decorator.example_two;

public class SportCarDecorator extends CarDecorator {
    public SportCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding sport car features.");
    }
}
