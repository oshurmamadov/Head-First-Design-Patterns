package observer;

public class HumidityObserver implements Observer {

    @Override
    public void update(WeatherDataItem weatherDataItem) {
        System.out.println("--> Humidity is " + weatherDataItem.getHumidity());
    }
}