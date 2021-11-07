package Subject;

import java.util.ArrayList;

import Observer.Observer;

public class WeatherData implements Subject {

  private ArrayList<Observer> observers;
  private float temp;
  private float humidity;
  private float pressure;

  public WeatherData() {
    observers = new ArrayList<>();
  }
  @Override
  public void notifyObserver() {
    for(int i=0; i < observers.size(); i++) {
      Observer observer = (Observer) observers.get(i);
      observer.update(temp, humidity, pressure);
    }
    
  }
  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
    
  }
  @Override
  public void removeObserver(Observer o) {
    int index = observers.indexOf(o);
    observers.remove(index);
  }

  public void measurementChanged() {
    notifyObserver();
  }

  public void setMeasurement(float temp, float humidity, float pressure) {
    this.temp = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementChanged();
  }
  
}
