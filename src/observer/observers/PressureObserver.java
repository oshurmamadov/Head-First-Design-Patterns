package observer.observers;

import observer.WeatherDataItem;

public class PressureObserver implements Observer {

    @Override
    public void update(WeatherDataItem weatherDataItem) {
        System.out.println("--> Pressure is " + weatherDataItem.getPressure());
    }
}