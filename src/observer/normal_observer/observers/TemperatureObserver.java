package observer.normal_observer.observers;

import observer.normal_observer.WeatherDataItem;

public class TemperatureObserver implements Observer {

    @Override
    public void update(WeatherDataItem weatherDataItem) {
        System.out.println("--> Temp is " + weatherDataItem.getTemperature());
    }
}