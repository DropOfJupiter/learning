package com.qtt.test;

import java.util.ArrayList;
import java.util.List;

import com.qtt.designpatterns.observer.Observer;
import com.qtt.designpatterns.observer.Subject;
import com.qtt.designpatterns.observer.WeatherData;
import com.qtt.designpatterns.observer.WeatherStatistics;

/**
 * ���Թ۲���ģʽ
 * 
 * @author Administrator
 *
 */
public class TestObserver {

	public static void main(String[] args) {
		// ������Ϣ���¶ȣ�ʪ�ȣ���ѹ
	    String temperature="27��";
	    String humidity="75%";
	    String pressure = "43pa";
	    // �۲����б�
	    List<Observer> observers=new ArrayList<Observer>();
		// ʵ�������۲���
		WeatherData weatherData = new WeatherData(temperature,humidity,pressure,observers);
		// ʵ�����۲���1
		Observer weatherStatistics1 = new WeatherStatistics(weatherData);
		// ʵ�����۲���2
		Observer weatherStatistics2 = new WeatherStatistics(weatherData);
		// ʵ�����۲���3
		Observer weatherStatistics3 = new WeatherStatistics(weatherData);
		weatherData.registerObserver(weatherStatistics1);
		weatherData.registerObserver(weatherStatistics2);
		weatherData.registerObserver(weatherStatistics3);
		weatherData.measureChanged();
	}
}
