package com.qtt.designpatterns.observer;

//import java.util.Observable;
import com.qtt.designpatterns.observer.Observer;

/**
 * ����ͳ��
 * 
 * @author Administrator
 *
 */
public class WeatherStatistics implements Observer {
	// ����������Ϣ
	private String temperature;
	private String humidity;
	private String pressure;
	// ���۲���
	private Subject weatherData;

	public WeatherStatistics(Subject weatherData) {
		this.weatherData = weatherData;
		// ��ʼ����ʱ��ע���Լ�
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
		return "����ͳ��{" + "temperature='" + temperature + '\'' + ", humidity='" + humidity + '\'' + ", pressure='"
				+ pressure + '\'' + '}';
	}
	// public void update(Observable observable, Object obj) {
	// // TODO Auto-generated method stub
	//
	// }

}
