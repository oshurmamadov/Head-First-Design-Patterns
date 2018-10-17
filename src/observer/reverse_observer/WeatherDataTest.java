package observer.reverse_observer;

import observer.reverse_observer.observers.HumidityObserver;
import observer.reverse_observer.subject.WeatherData;

public class WeatherDataTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        WeatherDataItem itemOne = new WeatherDataItem();
        itemOne.setHumidity("40%");
        WeatherDataItem itemTwo = new WeatherDataItem();
        itemTwo.setHumidity("12%");

        HumidityObserver humidityObserver = new HumidityObserver(weatherData);
        humidityObserver.observe();

        weatherData.setWeatherData(itemOne);

        humidityObserver.remove();

        weatherData.setWeatherData(itemTwo);
    }
}