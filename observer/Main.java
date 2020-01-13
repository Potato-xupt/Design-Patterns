package observer;

import observer.displayElement.CurrentConditionDisplay;
import observer.displayElement.ForecastDisplay;
import observer.displayElement.StatisticsDisplay;
import observer.subject.WeatherData;

public class Main {

	public static void main(String[] args) {
	
		WeatherData weatherData = new WeatherData();
	    CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
	    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
	    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
	    
	    weatherData.setMeasurements(0, 0, 0);
	    weatherData.removeObserver(currentConditionDisplay);
	    System.out.println("气象数据发生变化.....");
	    weatherData.setMeasurements(1, 1, 1);
	}
}
