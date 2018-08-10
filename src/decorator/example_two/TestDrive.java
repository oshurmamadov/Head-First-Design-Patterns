package decorator.example_two;

public class TestDrive {
    public static void main(String[] args) {
        Car sportCar = new SportCarDecorator(new BasicCar());
        Car luxuryCar = new LuxuryCarDecorator(new BasicCar());
        Car luxurySportCar = new LuxuryCarDecorator(new SportCarDecorator(new BasicCar()));

        sportCar.assemble();
        luxuryCar.assemble();
        luxurySportCar.assemble();
    }
}
