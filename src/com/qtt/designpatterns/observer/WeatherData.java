package com.qtt.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ����վʵ�ֱ��۲��߽ӿ�
 * @author Administrator
 *
 */
public class WeatherData implements Subject {
	// ������Ϣ���¶ȣ�ʪ�ȣ���ѹ
    private String temperature;
    private String humidity;
    private String pressure;
    // �۲����б�
    private List<Observer> observers;
    
    public WeatherData(String temperature, String humidity, String pressure, List<Observer> observers) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.observers = observers;
	}
    /**
     * ע��۲���
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
	 * ɾ���۲���
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
	 * ֪ͨ���й۲���,�������صĹ۲����б�ִ�����ǵ�update����
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
     * �����б仯ʱ��������
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
