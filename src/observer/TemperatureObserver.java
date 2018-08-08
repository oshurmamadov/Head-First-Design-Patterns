package observer;

public class TemperatureObserver implements Observer {
    public TemperatureObserver(Observable observable) {
        observable.registerObserver(this);
    }

    @Override
    public void update(WeatherDataItem weatherDataItem) {
        System.out.println("--> Temp is " + weatherDataItem.getTemperature());
    }
}