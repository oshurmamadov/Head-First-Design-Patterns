package observer;

public class PressureObserver implements Observer {
    public PressureObserver(Observable observable) {
        observable.registerObserver(this);
    }

    @Override
    public void update(WeatherDataItem weatherDataItem) {
        System.out.println("--> Pressure is " + weatherDataItem.getPressure());
    }
}