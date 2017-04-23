package com.qtt.test;

import java.util.ArrayList;
import java.util.List;

import com.qtt.designpatterns.observer.Observer;
import com.qtt.designpatterns.observer.Subject;
import com.qtt.designpatterns.observer.WeatherData;
import com.qtt.designpatterns.observer.WeatherStatistics;

/**
 * 测试观察者模式
 * 
 * @author Administrator
 *
 */
public class TestObserver {

	public static void main(String[] args) {
		// 气象信息：温度，湿度，气压
	    String temperature="27度";
	    String humidity="75%";
	    String pressure = "43pa";
	    // 观察者列表
	    List<Observer> observers=new ArrayList<Observer>();
		// 实例化被观察者
		WeatherData weatherData = new WeatherData(temperature,humidity,pressure,observers);
		// 实例化观察者1
		Observer weatherStatistics1 = new WeatherStatistics(weatherData);
		// 实例化观察者2
		Observer weatherStatistics2 = new WeatherStatistics(weatherData);
		// 实例化观察者3
		Observer weatherStatistics3 = new WeatherStatistics(weatherData);
		weatherData.registerObserver(weatherStatistics1);
		weatherData.registerObserver(weatherStatistics2);
		weatherData.registerObserver(weatherStatistics3);
		weatherData.measureChanged();
	}
}
