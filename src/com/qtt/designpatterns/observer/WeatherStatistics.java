package com.qtt.designpatterns.observer;

//import java.util.Observable;
import com.qtt.designpatterns.observer.Observer;

/**
 * 气象统计
 * 
 * @author Administrator
 *
 */
public class WeatherStatistics implements Observer {
	// 本地气象信息
	private String temperature;
	private String humidity;
	private String pressure;
	// 被观察者
	private Subject weatherData;

	public WeatherStatistics(Subject weatherData) {
		this.weatherData = weatherData;
		// 初始化的时候注册自己
		weatherData.registerObserver(this);
	}

	public void update(String temperature, String humidity, String pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.display();

	}

	private void display() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "气象统计{" + "temperature='" + temperature + '\'' + ", humidity='" + humidity + '\'' + ", pressure='"
				+ pressure + '\'' + '}';
	}
	// public void update(Observable observable, Object obj) {
	// // TODO Auto-generated method stub
	//
	// }

}
