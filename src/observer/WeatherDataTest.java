package observer;

public class WeatherDataTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        WeatherDataItem itemOne = new WeatherDataItem();
        itemOne.setTemperature("40 Grad");
        itemOne.setHumidity("40%");
        itemOne.setPressure("500mPa");

        WeatherDataItem itemTwo = new WeatherDataItem();
        itemTwo.setTemperature("66 Grad");
        itemTwo.setHumidity("67%");
        itemTwo.setPressure("888mPa");

        WeatherDataItem itemThree = new WeatherDataItem();
        itemThree.setTemperature("6 Grad");
        itemThree.setHumidity("6%");
        itemThree.setPressure("971mPa");

        weatherData.registerObserver(new TemperatureObserver());
        weatherData.registerObserver(new HumidityObserver());
        PressureObserver pressureObserver = new PressureObserver();
        weatherData.registerObserver(pressureObserver);

        weatherData.setWeatherData(itemOne);
        weatherData.setWeatherData(itemTwo);

        weatherData.removeObserver(pressureObserver);

        weatherData.setWeatherData(itemThree);
    }
}