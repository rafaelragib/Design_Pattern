/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Weather_Station;

/**
 *
 * @author 101xo
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        
        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
        
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(80, 70, 29.4f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }
    
}
