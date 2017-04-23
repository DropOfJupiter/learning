package com.qtt.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 气象站实现被观察者接口
 * @author Administrator
 *
 */
public class WeatherData implements Subject {
	// 气象信息：温度，湿度，气压
    private String temperature;
    private String humidity;
    private String pressure;
    // 观察者列表
    private List<Observer> observers;
    
    public WeatherData(String temperature, String humidity, String pressure, List<Observer> observers) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.observers = observers;
	}
    /**
     * 注册观察者
     */
	public synchronized void registerObserver(Observer o) {
		if(o==null){
			 throw new NullPointerException();
		}
		if(!observers.contains(o)){
			observers.add(o);
		}
	}
	/**
	 * 删除观察者
	 */
	public synchronized void removeObserver(Observer o) {
		if(o==null){
			 throw new NullPointerException();
		}
		if(observers.indexOf(o)>0){
			observers.remove(o);
		}

	}
	/**
	 * 通知所有观察者,遍历本地的观察者列表，执行它们的update方法
	 */
	public void notifyObservers() {
		this.temperature = getTemperature();
        this.humidity = getHumidity();
        this.pressure = getPressure();
        for(Observer o: observers){
            o.update(temperature,humidity,pressure);
        };
	}
	/**
     * 气温有变化时立即调用
     */
    public void measureChanged(){
        notifyObservers();
    }
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getPressure() {
		return pressure;
	}
	public void setPressure(String pressure) {
		this.pressure = pressure;
	}
	public List<Observer> getObservers() {
		return observers;
	}
	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

}
