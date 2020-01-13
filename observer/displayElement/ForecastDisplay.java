package observer.displayElement;

import observer.observer.Observer;
import observer.subject.Subject;

public class ForecastDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("ForecastDisplay：温度：" + temperature  + "度，湿度：" + humidity + "%，压强：" + pressure);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure =pressure;
		display();
	}

}
