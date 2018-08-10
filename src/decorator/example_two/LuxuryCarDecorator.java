package decorator.example_two;

public class LuxuryCarDecorator extends CarDecorator {
    public LuxuryCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding luxxxxury car features.");
    }
}
