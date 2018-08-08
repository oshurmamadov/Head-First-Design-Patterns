package observer;

public class HumidityObserver implements Observer {
    public HumidityObserver(Observable observable) {
        observable.registerObserver(this);
    }

    @Override
    public void update(WeatherDataItem weatherDataItem) {
        System.out.println("--> Humidity is " + weatherDataItem.getHumidity());
    }
}