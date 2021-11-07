package DisplayElement;

import Observer.Observer;
import Subject.Subject;

public class CurrentConditionDisplay implements DisplayElement,Observer {

  private float temp;
  private float humidity;
  private Subject weatherData;

  public CurrentConditionDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("Current Condition: " + temp + "C degree and humidity: " + humidity+ "%");
    
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temp = temp;
    this.humidity = humidity;
    display();
    
  }
  
}
