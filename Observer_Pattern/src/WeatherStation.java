import DisplayElement.CurrentConditionDisplay;
import DisplayElement.HeatIndexDisplay;
import Subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) throws Exception {
        WeatherData weatherData = new WeatherData();

        new CurrentConditionDisplay(weatherData);
        new HeatIndexDisplay(weatherData);
        weatherData.setMeasurement(32, 100, 50);
    }
}
